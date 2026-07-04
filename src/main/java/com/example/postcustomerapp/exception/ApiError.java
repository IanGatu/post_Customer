package com.example.postcustomerapp.exception;

public class ApiError {
    private int status;
    private String message;
    private String error;

    public ApiError(int status, String error, String message){
        this.status=status;
        this.error=error;
        this.message=message;
    }
    
    public int getStatus(){
        return status;
    }

    public String getError(){
        return error;
    }

    public String getMessage(){
        return message;
    } 
}
