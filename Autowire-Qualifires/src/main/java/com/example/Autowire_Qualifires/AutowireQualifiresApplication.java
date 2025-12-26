package com.example.Autowire_Qualifires;

import com.example.Autowire_Qualifires.Classes.CallingClass;
import com.example.Autowire_Qualifires.Classes.TeacherClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowireQualifiresApplication {
	@Autowired
	CallingClass callingClass;

	public static void main(String[] args) {
		var context = SpringApplication.run(AutowireQualifiresApplication.class, args);
		var app = context.getBean(AutowireQualifiresApplication.class);
		app.mainCalling();
	}

	public void mainCalling(){
		callingClass.callingMethod();



	}


}
