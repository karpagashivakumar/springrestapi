package com.straypets.shiva.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Springdemo {
	@GetMapping("/signin")
		public String signin() {
		return "djfuijie";
	}

}
