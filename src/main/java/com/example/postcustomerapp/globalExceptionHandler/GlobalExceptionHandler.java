package com.example.postcustomerapp.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.postcustomerapp.customernotfoundException.CustomerNotFoundException;
import com.example.postcustomerapp.exception.ApiError;



@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ApiError> handleCustomerNotFound(CustomerNotFoundException ex) {
        ApiError error = new ApiError(ex.getMessage());
    
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
    
