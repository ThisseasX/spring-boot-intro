package com.example.spring_boot_intro.controllers;

import com.example.spring_boot_intro.dto.HelloRequest;
import com.example.spring_boot_intro.dto.HelloResponse;
import com.example.spring_boot_intro.services.interfaces.HelloService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
@AllArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/dog/{firstName}")
    private ResponseEntity<String> getHello(@PathVariable String firstName, @RequestParam String lastName) {
        List<String> hellos = helloService.getHellos();

        return ResponseEntity.ok("Hello" + " " + firstName + " " + lastName + "! " + "Hellos are: " + hellos);
    }

    @PostMapping("/dog")
    private ResponseEntity<HelloResponse> postHello(@RequestBody HelloRequest req) {
        HelloResponse response = new HelloResponse();
        response.setHelloMessage(req.hello().toUpperCase());
        response.setWorldMessage(req.world().toUpperCase());

        return ResponseEntity.ok(response);
    }
}
