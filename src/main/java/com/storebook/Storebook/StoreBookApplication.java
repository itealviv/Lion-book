package com.storebook.Storebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan("com.storebook.Storebook.models")
@EnableJpaRepositories("com.storebook.Storebook.dao")
public class StoreBookApplication {
	public static void main(String[] args) {
		SpringApplication.run(StoreBookApplication.class, args);

	}

	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/authors").allowedOrigins("http://store-book.tk");
				registry.addMapping("/author").allowedOrigins("http://store-book.tk");
				registry.addMapping("/author/{id}/books").allowedOrigins("http://store-book.tk");
			}
		};
	}
}
