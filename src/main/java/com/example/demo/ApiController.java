package com.example.demo;

import java.time.Duration;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;

@RestController
public class ApiController {

    @GetMapping("/")
    public Map<String, Object> root() {
        return Map.of(
            "service", "java25-springboot-demo",
            "status", "UP"
        );
    }

    @GetMapping("/api/health")
    public Map<String, Object> health() {
        return Map.of(
            "status", "UP",
            "service", "java25-springboot-demo"
        );
    }

    @GetMapping("/api/message")
    public Map<String, String> message() {
        return Map.of("message", "Hello from Java 25 + Spring Boot 4.1.1");
    }

    @PostMapping(value = "/api/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> stream(@RequestBody(required = false) Map<String, String> payload) {
        if (payload == null || payload.isEmpty() || payload.get("message") == null || payload.get("message").isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid request: expected JSON body with 'message'.");
        }

        String message = payload.get("message");
        String[] chunks = message.split("\\s+");

        return Flux.range(1, chunks.length)
            .map(index -> "chunk " + index + ": " + chunks[index - 1] + "\n")
            .delayElements(Duration.ofMillis(150));
    }
}
