package com.dipada.demoservice2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-2")
public class DummyController {
    @GetMapping
    public ResponseEntity<String> get_service_2() {
        return ResponseEntity.ok("Hello from service 2");
    }
}
