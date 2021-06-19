package ru.milandr.apigoodbye;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/goodbye")
public class GoodbyeController {

    @GetMapping
    public ResponseEntity<String> request1() {
        return ResponseEntity.ok("Goodbye from service 2");
    }
}
