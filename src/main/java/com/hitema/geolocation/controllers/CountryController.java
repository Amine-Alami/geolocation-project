package com.hitema.geolocation.controllers;

import com.hitema.geolocation.entities.Country;
import com.hitema.geolocation.services.CountryService;
import jakarta.annotation.PostConstruct;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.List;


@Controller
public class CountryController {

	private static final Logger log = LogManager.getLogger(CountryController.class);

	private CountryService service;

	public CountryController(CountryService service) {
		this.service = service;
	}

	@PostConstruct
	private void check() {
		log.info("Check postconstruct called service Up : "+(service!=null?"Yes":"No"));
	}
	
	
	@GetMapping("/countries")
    public ModelAndView getCountries() {
		log.trace("Appel controlleur Country");
		List<Country> countries = service.readAll();
        return new ModelAndView("countries","countries",countries);
    }

	@GetMapping("/countryModify")
	public ModelAndView getCountryModify() {
		log.trace("Appel getCountryModify Country");
		Country country = new Country();
		country.setLastUpdate(LocalDateTime.now());
		return new ModelAndView("countryModify","country",country);
	}

	@PostMapping ("/countryModify")
	public ModelAndView countryModify(@ModelAttribute("countryForm") Country country, ModelMap model) {
		log.trace("Appel countryModify : {} ", country);
		service.create(country);
		return new ModelAndView("countryModify","country",country);
	}
}
