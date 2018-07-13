package com.sweers.parcel.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class ParcelApiApp {
	public static void main(String[] args) {
		SpringApplication.run(ParcelApiApp.class, args);
	}

}
