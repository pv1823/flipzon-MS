package com.flipzon.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FlipzonApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipzonApplication.class, args);
	}

}
