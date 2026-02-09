package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestControllergit init
public class ControllerClass {

    @GetMapping("/")
    public String test(){
        return "test Successful";
    }

    @GetMapping("/get")
    public String testRequestBody (@RequestBody ModelClass modelClass){
        return modelClass.age;
    }

    @GetMapping("/variable/{name}")
    public String testVariableParams (@PathVariable String name){
        return name;
    }

    @GetMapping("/params")
    public String testRequestParams (@RequestParam ModelClass modelClass){
        return modelClass.age;
    }
}
