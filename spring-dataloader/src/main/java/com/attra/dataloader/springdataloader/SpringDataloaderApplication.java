package com.attra.dataloader.springdataloader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringDataloaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataloaderApplication.class, args);
	}

}
