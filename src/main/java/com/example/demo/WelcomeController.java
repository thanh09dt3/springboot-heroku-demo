package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Student;

@RestController
	public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome(Student stu) {
		
		return "Welcome to spring boot heroku demo Hương dở hơi " + stu.getName();
	}
}
