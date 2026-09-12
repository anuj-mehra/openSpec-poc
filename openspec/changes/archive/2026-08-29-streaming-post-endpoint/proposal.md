## Why

The REST API needs a POST endpoint that can return a streamed response so clients can receive incremental data without waiting for a complete payload to be assembled. This is useful for long-running or progressively generated results while keeping the API simple and extensible.

## What Changes

- Add a new POST-based streaming response endpoint to the existing REST API capability.
- Define a response contract for incremental payload delivery without changing the general API shape of the application.
- Capture the behavior in the project planning artifacts before implementation so the endpoint is specified and validated consistently.

## Capabilities

### New Capabilities
- None

### Modified Capabilities
- `rest-api`: Extend the existing REST API capability to include a POST endpoint that emits a streaming response.

## Impact

- `ApiController.java` will gain a new HTTP endpoint contract.
- Client integrations will be able to consume progressive, chunked response data.
- The application’s REST API specification will be updated to cover streaming behavior and response expectations.
