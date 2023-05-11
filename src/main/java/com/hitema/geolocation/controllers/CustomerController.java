package com.hitema.geolocation.controllers;

import com.hitema.geolocation.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/customers")
    public ModelAndView getAll(){
        log.trace("Customers Get All called ...");
        var view = new ModelAndView();
        view.addObject("mmsg","autres attribut");
        view.addObject("customers",service.readAll());
        return view;
    }
}
