package com.example.docker.DockerExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerExampleApplication {

	@RequestMapping("/")
	public String hello() {
		return "Hello world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);
	}
}
