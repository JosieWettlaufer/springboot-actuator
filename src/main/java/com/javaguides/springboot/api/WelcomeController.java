package com.javaguides.springboot.api;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // Base path for all endpoints
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Spring Boot API!";
    }

    @PostMapping("/add")
    public String addData(@RequestBody String data) {
       // Invoke-WebRequest -Uri http://localhost:8080/api/add -Method POST -Headers @{ "Content-Type" = "text/plain" } -Body "Hello Spring Boot!"

        return "Data received: " + data;
    }
}
