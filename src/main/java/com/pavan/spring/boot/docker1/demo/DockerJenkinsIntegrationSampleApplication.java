package com.pavan.spring.boot.docker1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationSampleApplication.class, args);
		System.out.println("hello");
	}

}
