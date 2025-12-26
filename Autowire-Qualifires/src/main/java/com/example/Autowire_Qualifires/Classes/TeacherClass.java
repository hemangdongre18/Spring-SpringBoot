package com.example.Autowire_Qualifires.Classes;

import com.example.Autowire_Qualifires.Interfaces.Interface;
import org.springframework.stereotype.Service;

@Service("TeacherService")
public class TeacherClass implements Interface {
    @Override
    public void call() {
        System.out.println("Teacher : ");
    }
}
