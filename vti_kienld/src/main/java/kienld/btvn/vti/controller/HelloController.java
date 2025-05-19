package kienld.btvn.vti.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/l1")
public class HelloController {

    @GetMapping("/gethello1")
    public String getHello1() {
        return "Hello World";
    }

    @GetMapping("/gethello2")
    public ResponseEntity<?> getHello2(@RequestParam("name") String name) {
        return ResponseEntity.ok("Name: " + name);
    }
}
