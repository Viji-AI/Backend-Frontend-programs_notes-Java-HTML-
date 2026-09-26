package com.example.httpstatus.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StatusController {

    // 200 OK
    @GetMapping("/ok")
    public ResponseEntity<String> ok() {
        return ResponseEntity.ok("Request successful");
    }

    // 201 Created
    @PostMapping("/created")
    public ResponseEntity<String> created() {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Resource created successfully");
    }

    // 204 No Content
    @DeleteMapping("/no-content")
    public ResponseEntity<Void> noContent() {
        return ResponseEntity.noContent().build();
    }
}