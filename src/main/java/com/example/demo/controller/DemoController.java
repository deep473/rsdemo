package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class DemoController {
	@GetMapping("/call2")
	public String call() {
		System.out.println("call received");
		return "call received";
	}
}
