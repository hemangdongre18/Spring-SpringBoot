package com.example.ControllerAndRestController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerClass {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
