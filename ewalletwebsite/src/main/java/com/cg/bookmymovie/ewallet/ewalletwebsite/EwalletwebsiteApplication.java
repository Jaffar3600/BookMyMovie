package com.cg.bookmymovie.ewallet.ewalletwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EwalletwebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EwalletwebsiteApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}

