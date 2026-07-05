package com.example.postcustomerapp.customerService;
import org.springframework.stereotype.Service;

import com.example.postcustomerapp.customer.Customer;
import com.example.postcustomerapp.customerRepository.CustomerRepository;
import com.example.postcustomerapp.customernotfoundException.CustomerNotFoundException;

@Service
public class CustomerService {
    CustomerRepository repository;

    //constructor for dependency injection
    public CustomerService(CustomerRepository repository){
        this.repository=repository;
    }

    //method to create customer
    public Customer createCustomer( Customer customer){
        if (customer==null){
            throw new CustomerNotFoundException("customer cannot be null");
        }
        else{
            return repository.saveCustomer(customer);
        }

    }

}
