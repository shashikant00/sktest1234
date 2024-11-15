package com.coursecube.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String happy() {
		return "Hello Happy";
	}
	
	@GetMapping("/show")
	public String showWishMsg() {
		return "Show wish message";
	}
	
	@GetMapping("/show")
	public String welcome() {
		return "Welcome to SpringBoot";
	}
}
