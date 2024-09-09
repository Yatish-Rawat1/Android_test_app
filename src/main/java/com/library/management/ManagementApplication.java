package com.library.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ManagementApplication {

	public static void main(String[] args) {

		ApplicationContext app= SpringApplication.run(ManagementApplication.class, args);
	}

}
