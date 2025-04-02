package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactManager {
	
	 @GetMapping("/hello")
	    public String sayHello() {
	        return "Hello Manager!";
	    }


}
