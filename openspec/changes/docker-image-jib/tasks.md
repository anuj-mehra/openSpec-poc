## 1. Build configuration

- [x] 1.1 Add Jib Maven plugin configuration with the Java 25 runtime image and verify the POM resolves the plugin correctly
- [x] 1.2 Confirm the project build still packages through Maven and the Jib configuration does not change application behavior

## 2. CI integration

- [x] 2.1 Update GitHub Actions to use Java 25 and add a Jib image build step in the main branch workflow and verify the YAML is valid
- [x] 2.2 Update the feature branch workflow to build the Jib image for validation and verify the workflow remains consistent with the project setup

## 3. Verification

- [ ] 3.1 Run the relevant Maven/Jib verification command and confirm the image build completes successfully or report any environment-specific blocker

This final verification is currently blocked in this local environment because Docker is not running (`docker load` fails with 'Cannot connect to the Docker daemon at unix:///var/run/docker.sock'). The Maven package step still succeeds, and the CI workflow is ready for a Docker-enabled runner.
