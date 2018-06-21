package com.frugalis.EurekaServiceClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EurekaServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceClientApplication.class, args);
	}
}
