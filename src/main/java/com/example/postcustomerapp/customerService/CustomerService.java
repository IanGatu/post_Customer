package com.example.postcustomerapp.customerService;
import org.springframework.stereotype.Service;

import com.example.postcustomerapp.customer.Customer;
import com.example.postcustomerapp.customerRepository.CustomerRepository;

@Service
public class CustomerService {
    CustomerRepository repository;

    //constructor for dependency injection
    public CustomerService(CustomerRepository repository){
        this.repository=repository;
    }

    //method to create customer
    public Customer createCustomer( Customer customer){
        if (customer!=null){
            return repository.saveCustomer(customer);
        }
        else{
            System.out.println("object cannot be null");
            return null;
        }

    }

}
