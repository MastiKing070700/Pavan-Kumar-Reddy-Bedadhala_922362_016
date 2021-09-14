package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KuberneteDemoApplication {

	@RequestMapping("/greet")
	public String message()

	{
		return "Welcome Pavan I Love You ";
	}
	public static void main(String[] args) {
		SpringApplication.run(KuberneteDemoApplication.class, args);
	}

}
