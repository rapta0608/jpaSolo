package com.example.jpaSolo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@SpringBootApplication
@EnableJpaAuditing
public class JpaSoloApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSoloApplication.class, args);
	}


	@Bean
	public AuditorAware<String> auditorAware(){
		return ()-> Optional.of("하이");
	}
}
	