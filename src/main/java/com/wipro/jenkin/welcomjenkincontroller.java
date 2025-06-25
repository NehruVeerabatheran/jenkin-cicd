package com.wipro.jenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/aws")
public class welcomjenkincontroller {
	@GetMapping
	public String WelcomeJenkin() {
		return"Welcome to Jenkin Vel Tech";
	}

}
