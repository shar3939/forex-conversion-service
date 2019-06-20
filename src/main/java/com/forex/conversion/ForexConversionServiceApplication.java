package com.forex.conversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ForexConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexConversionServiceApplication.class, args);
	}

}
