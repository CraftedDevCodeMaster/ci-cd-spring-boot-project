package com.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("ci")
public class CiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdApplication.class, args);
	}

	
	@PostMapping("cd")
	public String aytobuild()
	{
		return "Hi Pravin Reddy !!!!!!!!!!!!!";
	}
}
