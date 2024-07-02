package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {
	
	@GetMapping("/")
	public String getDocker() {
		
		return "Hello Docker  I am working perfectly";
	}

}
