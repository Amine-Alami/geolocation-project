package com.hitema.geolocation.controllers;

import com.hitema.geolocation.entities.Customer;
import com.hitema.geolocation.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/customers")
    public ModelAndView getAll(){
        log.trace("Getting All Customers called ...");
        var view = new ModelAndView();
        view.addObject("customers",service.readAll());
        return view;
    }

    @GetMapping("/customers/{customerId}")
    public ModelAndView getCountry(@PathVariable Long customerId) {
        Customer customer = service.read(customerId);
        ModelAndView view = new ModelAndView();
        view.addObject("customer", customer); // Pass the clicked customer ID to the view
        view.setViewName("redirect:/customer/" + customerId); // Redirect to the customer page
        return view;
    }
}
