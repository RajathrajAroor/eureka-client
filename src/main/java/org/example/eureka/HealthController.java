package org.example.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Eureka Client Service is running!";
    }

    @GetMapping("/health")
    public String health() {
        return "Service is healthy";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Eureka client!";
    }
}

