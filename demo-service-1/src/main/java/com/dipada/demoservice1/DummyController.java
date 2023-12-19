package com.dipada.demoservice1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-1")
public class DummyController {
    @GetMapping
    public ResponseEntity<String> get_service_1() {
        return ResponseEntity.ok("Hello from service 1");
    }
}
