## Context

The project is a Java 25 Spring Boot application built with Maven. The repository already uses GitHub Actions for build validation, but the current workflows only compile and test the app without producing a container image. See proposal.md for motivation and the existing build/test flow in `.github/workflows/buildMain.yaml` and `.github/workflows/buildFeature.yaml`.

## Goals / Non-Goals

**Goals:**
- Produce a container image from the Java application with Jib
- Keep image creation aligned with the current Maven build lifecycle
- Integrate image build steps into the existing CI workflow without adding unrelated infrastructure

**Non-Goals:**
- Publishing to a registry in this change
- Changing application behavior or API contracts
- Replacing the Maven build with a separate Docker-based pipeline

## Decisions

### Use Jib instead of a handwritten Dockerfile

Jib is a better fit for this project because the application is already Java-based and built with Maven. It keeps container creation inside the build tooling, avoids requiring a local Docker daemon in CI, and reduces maintenance overhead compared with a hand-written Dockerfile.

Alternatives considered:
- Custom Dockerfile: more operational surface area and more manual maintenance for a simple Spring Boot service
- External image build step: adds build complexity without improving the Java-first workflow

### Build the image from the Maven lifecycle

The image build should run through Maven so the same dependency graph, compiler settings, and packaging flow are reused. This keeps the packaging step deterministic and avoids a separate, diverging build path.

### Use a Java runtime image for the container base

The container should use a Java runtime image compatible with the Spring Boot app, with the Jib plugin configured to set the runtime image explicitly. This keeps the final image lightweight while still matching the project’s Java 25 target.

Alternatives considered:
- Using the app’s build image as the runtime: larger and unnecessary for a packaged service
- Using a generic base image without Java version alignment: higher risk of runtime compatibility issues

## Risks / Trade-offs

- [Java version drift] → Ensure the workflow and Jib runtime image both use the same Java version as the project target, or the build will fail in CI.
- [Registry publishing scope] → This change intentionally keeps image creation local to the build process; publishing is deferred to a later change if needed.
- [Image size] → Jib keeps the image smaller than a manually assembled multi-stage Docker build by default, but packaging choices still affect final size.

## Migration Plan

1. Add the Jib Maven plugin and configure the container image name and base image.
2. Update CI workflows to install Java 25 and invoke the Jib build step as part of validation.
3. Validate the Maven lifecycle locally or in CI to confirm the image assembles successfully.
4. If registry publication is needed later, add a separate release-oriented workflow that targets a registry.

## Open Questions

None at this time. The build path is clear and there is no requirement to publish or alter application behavior.
