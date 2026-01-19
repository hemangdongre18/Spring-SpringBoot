package com.example.ControllerAndRestController.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {
    @GetMapping("/")
    public String home(){
        return "hi @Restcontroller";
    }
}
