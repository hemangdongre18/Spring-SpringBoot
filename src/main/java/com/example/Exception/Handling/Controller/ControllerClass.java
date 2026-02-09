package com.example.Exception.Handling.Controller;

import ch.qos.logback.classic.spi.IThrowableProxy;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
    @GetMapping("/")
    public String callException() {
        throw new RuntimeException();
    }

    @GetMapping("/another")
    public String callAnotherException(){
        throw new IllegalArgumentException();
    }

    @ExceptionHandler(RuntimeException.class)
    public String exceptionHandlerMethod(){
        return "Exception form Global exception Handler Method";
    }
}
