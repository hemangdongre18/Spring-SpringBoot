package com.example.Autowire_Qualifires.Classes;

import com.example.Autowire_Qualifires.Interfaces.Interface;
import org.springframework.stereotype.Service;

@Service("StudentService")
public class StudentClass implements Interface {
    @Override
    public void call() {
        System.out.println("Student :");
    }
}
