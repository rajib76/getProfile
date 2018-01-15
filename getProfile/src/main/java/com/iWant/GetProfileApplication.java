package com.iWant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GetProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetProfileApplication.class, args);
	}
}
