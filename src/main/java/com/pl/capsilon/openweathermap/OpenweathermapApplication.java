package com.pl.capsilon.openweathermap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class OpenweathermapApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenweathermapApplication.class, args);
	}
}
