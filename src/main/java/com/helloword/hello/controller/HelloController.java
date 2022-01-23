package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {
	
	@GetMapping
	@RequestMapping("/hello" )
	public String hello() { 
		
		return "Hello Word";
	}

	@GetMapping
	@RequestMapping("/HabiMent")
	public String HabiMent() {
		
		return "Trabalho em equipe e Persistencia";
		
	}
	@GetMapping
	@RequestMapping("/Desenvolver")
	public String Desenvolver() {
		
		return "Me desenvolver";
	}
}
