package com.poc.processdata;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProcessDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessDataApplication.class, args);
	}
	
}
