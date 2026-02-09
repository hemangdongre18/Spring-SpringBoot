package com.example.Exception.Handling.ExceptionHandlerClass;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlingClass {
    @ExceptionHandler(IllegalAccessException.class)
    public String handleGlobalIllegalAccessException(){
        return "IllegalAccessException from Controller Advice";
    }
}
