package com.digitalinnovation.livecoding;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDynamoDBRepositories
@SpringBootApplication
public class LivecodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivecodingApplication.class, args);
		System.out.println("Super poderes com webflux");
	}

}