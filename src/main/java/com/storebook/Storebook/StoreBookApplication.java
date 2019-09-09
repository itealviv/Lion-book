package com.storebook.Storebook;

import com.storebook.Storebook.services.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.storebook.Storebook.models")
@EnableJpaRepositories("com.storebook.Storebook.dao")
public class StoreBookApplication {
	@Autowired
	private static MediaService mediaService;

	public static void main(String[] args) {
		SpringApplication.run(StoreBookApplication.class, args);

	}

}
