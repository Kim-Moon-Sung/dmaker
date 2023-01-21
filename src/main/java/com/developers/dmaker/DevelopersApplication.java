package com.developers.dmaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class DevelopersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevelopersApplication.class, args);
	}

}
