package com.padmanabhan.samplespringproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping
    public String sendMessage(){
        return "Hello World Spring Boot Program";
    }
}
