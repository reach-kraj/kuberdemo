package com.demo.kuberdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of(
                "message", "Hello from Demo App!",
                "version", "1.0",
                "timestamp", java.time.LocalDateTime.now().toString()
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "status", "UP",
                "service", "dempapp",
                "timestamp", java.time.LocalDateTime.now().toString()
        );
    }

    // This endpoint will be added later via commit to demonstrate CI/CD
    // @GetMapping("/users")
    // public Map<String, Object> getUsers() {
    //     return Map.of(
    //         "users", List.of(
    //             Map.of("id", 1, "name", "John Doe", "email", "john@example.com"),
    //             Map.of("id", 2, "name", "Jane Smith", "email", "jane@example.com")
    //         ),
    //         "total", 2,
    //         "timestamp", java.time.LocalDateTime.now().toString()
    //     );
    // }
}
