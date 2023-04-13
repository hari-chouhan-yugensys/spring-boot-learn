package com.learn.startup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@GetMapping("/health")
	public String health() 
	{
		return "Service up and Running!! Hello You guys are here ";
	}
}
