package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;

@RestController
@SpringBootApplication
public class TestSpringBoot {

	@RequestMapping("/greet")
	public String greeting(){
		return "I love springBoot" ;
	}

	public static void main(String[] args){
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
