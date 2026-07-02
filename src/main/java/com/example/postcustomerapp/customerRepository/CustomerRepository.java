package com.example.postcustomerapp.customerRepository;
import org.springframework.stereotype.Repository;

import com.example.postcustomerapp.customer.Customer;

//import com.example.postcustomerapp.customer.Customer;

//import com.example.postcustomerapp.customer.Customer;


@Repository
public class CustomerRepository {
    public Customer  saveCustomer(Customer customer){
        System.out.println("Customer" + customer.getName() + "saved successfully");
        return customer;
    }
}
