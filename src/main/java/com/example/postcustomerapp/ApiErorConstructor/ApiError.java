package com.example.postcustomerapp.ApiErorConstructor;

public class ApiError {
    //private int status;
    //private String error;
    private String message;

    public ApiError(String message){
        //this.status=status;
        //this.error=error;
        this.message=message;
    }
    
    /*public int getStatus(){
        return status;
    }*/

    /*public String getError(){
        return error;
    }*/

    public String getMessage(){
        return message;
    } 
}
