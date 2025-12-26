package com.example.Autowire_Qualifires.Classes;

import com.example.Autowire_Qualifires.Interfaces.Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CallingClass {

    @Autowired
    @Qualifier("StudentService")
    Interface anInterface;
     public void callingMethod(){
         anInterface.call();
     }
}
