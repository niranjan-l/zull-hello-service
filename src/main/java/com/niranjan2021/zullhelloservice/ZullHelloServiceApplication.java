package com.niranjan2021.zullhelloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZullHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZullHelloServiceApplication.class, args);
	}

}
