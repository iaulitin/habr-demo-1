package com.example.apiservice1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> request1() {
        return ResponseEntity.ok("Hello from service 1");
    }
}
