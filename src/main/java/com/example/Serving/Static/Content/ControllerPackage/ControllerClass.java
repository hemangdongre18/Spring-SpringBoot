package com.example.Serving.Static.Content.ControllerPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class ControllerClass {
    @GetMapping("/")
    public String funONe() {
        return "hi";
    }

    @GetMapping("/static")
    public String funTWo(){
        return "redirect:/hi.html";
    }
}
