package com.example.FlightAppDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FlightAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightAppDemoApplication.class, args);
	}

}
