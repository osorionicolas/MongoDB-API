package com.nosorio.nosql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.nosorio.nosql")
public class NosqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(NosqlApplication.class, args);
	}

}
