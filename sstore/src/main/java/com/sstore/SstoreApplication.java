package com.sstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.sstore", "com.sstore.controller", "com.sstore.config"})
public class SstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SstoreApplication.class, args);
	}
}
