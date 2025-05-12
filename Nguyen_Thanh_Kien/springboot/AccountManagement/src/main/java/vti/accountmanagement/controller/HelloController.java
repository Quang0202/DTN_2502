package vti.accountmanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/helloword")
public class HelloController {

    @GetMapping("")
    public ResponseEntity<String> getUser(@RequestParam String name) {

            return ResponseEntity.ok("Hello " + name);
    }
}
