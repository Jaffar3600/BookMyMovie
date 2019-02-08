package com.capgemini.websiteService.websiteController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class websiteController {

	
	
	@Autowired
	private CircuitBreaker breaker;
	
	   @RequestMapping("/name")
	   public String home() {
		   System.out.println("hello shubham");
//		   String responseOne = template.getForObject("http://localhost:9090/hello", String.class);
//		   System.out.println(responseOne);
		   
//		   URI uri = URI.create("http://localhost:9090/hello");
//		   System.out.println( template.getForObject(uri, String.class));
		    return breaker.getMessage();
		  // return new ModelAndView("hello","message",responseOne);
	   }
}
