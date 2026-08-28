package com.example.demo;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
