## 1. API contract definition

- [x] 1.1 Define the streaming POST request and response contract and verify the expected payload and content type behavior are documented
- [x] 1.2 Confirm the endpoint fits the existing `rest-api` capability and verify no unrelated API requirements are changed

## 2. Implementation readiness

- [x] 2.1 Implement the new POST endpoint in `ApiController.java` and verify the endpoint is registered with the correct HTTP method
- [x] 2.2 Implement the streaming response behavior and verify the endpoint emits incremental output without buffering the entire response
- [x] 2.3 Add validation for malformed requests and verify the endpoint returns an appropriate error response instead of partial success data

## 3. Validation

- [x] 3.1 Run the application build and verify the project still compiles cleanly
- [x] 3.2 Execute endpoint smoke tests and verify the streaming POST behavior matches the specification
