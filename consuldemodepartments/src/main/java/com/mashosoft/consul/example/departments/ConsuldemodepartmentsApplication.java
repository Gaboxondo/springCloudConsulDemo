package com.mashosoft.consul.example.departments;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition
public class ConsuldemodepartmentsApplication {

	public static void main(String[] args) {
		SpringApplication.run( ConsuldemodepartmentsApplication.class, args);
	}

}
