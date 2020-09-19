package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication

// Execution of the sprint boot project starts here

public class BankingViewAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingViewAccountApplication.class, args);
	}

}
