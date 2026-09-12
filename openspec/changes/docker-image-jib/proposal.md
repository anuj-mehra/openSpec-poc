## Why

This project already validates and packages a Spring Boot application with Maven in GitHub Actions. Adding a Jib-based container build gives us a repeatable, Java-native way to create a Docker image without maintaining a custom Dockerfile and without changing the application’s runtime behavior.

## What Changes

- Add Jib Maven configuration so the Spring Boot app can be built as a container image directly from the Java build.
- Add or update CI workflow steps to run the image build as part of the project’s automated validation flow.
- Keep the change focused on packaging and delivery; there is no change to REST endpoints, service contracts, or user-facing application behavior.

## Capabilities

### New Capabilities
- None — this is a build and packaging improvement rather than a product capability change.

### Modified Capabilities
- None — no existing requirement-level behavior is changing.

## Impact

- Maven build configuration (`pom.xml`)
- GitHub Actions CI workflow(s)
- Container image creation during build/validation
- No application API, business logic, or runtime contract changes
