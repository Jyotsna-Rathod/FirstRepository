package com.cjc.in;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cjc.in.service.DocumentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Application running ........");
		Logger log = LoggerFactory.getLogger(DocumentService.class);
		log.info("saveDocument called");
		System.out.println("Document uploading added");
                System.out.println("Amruta added");
	}

}
