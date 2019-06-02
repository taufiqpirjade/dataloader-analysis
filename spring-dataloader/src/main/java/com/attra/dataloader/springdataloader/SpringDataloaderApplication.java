package com.attra.dataloader.springdataloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.attra.dataloader.springdataloader.repository.TransactionRepository;

@EnableScheduling
@SpringBootApplication
public class SpringDataloaderApplication {
	
	@Autowired
	private static TransactionRepository transactionRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataloaderApplication.class, args);
		
	}

}
