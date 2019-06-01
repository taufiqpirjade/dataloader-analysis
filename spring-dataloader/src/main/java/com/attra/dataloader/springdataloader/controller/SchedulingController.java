package com.attra.dataloader.springdataloader.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.attra.dataloader.springdataloader.repository.TransactionRepository;

@Configuration
@EnableScheduling
public class SchedulingController {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	private final static Logger logger = LoggerFactory.getLogger(SchedulingController.class);
	
	@Scheduled(fixedDelay=5000)
	public void getTransactionDataForFormatting() {
		logger.info("Batch running started");
		transactionRepository.findAll();
	}
}
