package com.cg.bookmymovie.websiteService.websiteController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bookmymovie.screeningservice.entity.Address;
import com.cg.bookmymovie.screeningservice.entity.Screening;

@RestController
public class WebsiteController {

	@Autowired
	private RestTemplate template;

	@RequestMapping("/name")
	public ModelAndView home() {
		System.out.println("hello shubham");
		return new ModelAndView("hello", "message", "shubham bhatt");
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/cityToSearch")
	public ModelAndView searchMovieInACity(@RequestParam String cityToSearch) {

		Set<Screening> allMovieShowingInACity = new HashSet<Screening>();

		ResponseEntity<Screening[]> screening = template.getForEntity("http://localhost:9090/screenings",
				Screening[].class);

		List<Screening> allScreenings = Arrays.asList(screening.getBody());

		for (Screening screeningToValidate : allScreenings) {
			
			Address address = screeningToValidate.getTheatreAddress();
			
			if (address.getCity().equalsIgnoreCase(cityToSearch)) {
				allMovieShowingInACity.add(screeningToValidate);
			}
		}

		return new ModelAndView("moviesShowing", "movies", allMovieShowingInACity);
	}
}

