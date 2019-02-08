package com.capgemini.websiteService.websiteController;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class CircuitBreaker {

	@Autowired
	private RestTemplate restTemplate;
	
	 @HystrixCommand(fallbackMethod = "reliable")
	  public String getMessage() {
	    URI uri = URI.create("http://localhost:9090/hello");

	    return this.restTemplate.getForObject(uri, String.class);
	  }

	  public String reliable() {
	    return "good afternoon)";
	  }

}
