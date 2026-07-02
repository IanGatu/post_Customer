package com.example.postcustomerapp.customer;
import jakarta.validation.constraints.NotBlank;


public class Customer{
    //fields
    @NotBlank
    private String name;
    @NotBlank
    private String accountType;

    //constructor
    public Customer(String name, String accountType) {
        this.name=name;
        this.accountType=accountType;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }
}

