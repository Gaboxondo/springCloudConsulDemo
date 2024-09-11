package com.mashosoft.consul.example.users.consuldemousers;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition
public class ConsuldemousersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsuldemousersApplication.class, args);
	}

}
