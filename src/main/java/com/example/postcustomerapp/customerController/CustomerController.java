package com.example.postcustomerapp.customerController;

//import jakarta.validation.constraints.NotBlank;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postcustomerapp.customer.Customer;
import com.example.postcustomerapp.customerService.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customers") // Directs all requests starting with /customers here
public class CustomerController {
    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping
    public Customer createCustomer(@Valid
         @RequestBody Customer customer) {
        return service.createCustomer(customer);
    }
}