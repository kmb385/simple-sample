package com.rhcloud.tothought;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rhcloud.tothought")
public class SimpleSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSampleApplication.class, args);
	}
}
