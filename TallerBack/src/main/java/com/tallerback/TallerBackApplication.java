package com.tallerback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.tallerback.*"})
@EntityScan("com.tallerback.entity")
@SpringBootApplication
@EnableJpaRepositories
public class TallerBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallerBackApplication.class, args);
	}

}