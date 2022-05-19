package com.Relations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.Relations.entity") 
@EnableJpaRepositories("com.Relations.Repository")
public class RelationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationsApplication.class, args);
	}

}
