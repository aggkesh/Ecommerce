package com.ecommerce.aggregatorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AggregatorserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AggregatorserviceApplication.class, args);
	}
	
	@Bean(name = "restTemp")
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
