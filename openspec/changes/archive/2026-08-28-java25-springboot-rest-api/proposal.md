## Why

This project needs a clear, modern Java 25 + Spring Boot 4.1.1 baseline for a simple REST API so future feature work can start from a consistent, production-ready foundation. The repo currently has no Maven application structure or REST API contract, so this change establishes the required capability and planning baseline.

## What Changes

- Create a new OpenSpec change for a Spring Boot Maven application using Java 25 and Spring Boot 4.1.1.
- Define a simple REST API capability that will eventually support lightweight HTTP endpoints and JSON responses.
- Capture the technical design and task plan for the application before implementation begins.
- Establish the expected behavior and validation points for the service contract without creating implementation code.

## Capabilities

### New Capabilities
- `rest-api`: Initial REST API capability for a Java 25 Spring Boot application, including service health and JSON response behavior.

### Modified Capabilities
- None

## Impact

- Project structure will be aligned to a Maven-based Spring Boot application.
- Future implementation work will be organized around a simple REST API capability.
- Build and runtime expectations will be captured in planning artifacts rather than code.
