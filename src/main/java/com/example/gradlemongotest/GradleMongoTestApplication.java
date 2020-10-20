package com.example.gradlemongotest;

import com.example.gradlemongotest.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = {"com.example.gradlemongotest.repository"}, considerNestedRepositories = true)
@SpringBootApplication
public class GradleMongoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleMongoTestApplication.class, args);
	}

}
