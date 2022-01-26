package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/index")
	public String index() {
		return "This is the main page";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam("location") String location, @RequestParam("name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}

}
