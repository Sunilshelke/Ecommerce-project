package com.example.Ecommerce.exeptions;

public class InvalidCardException extends Exception{

    public InvalidCardException(String message){
        super(message);
    }
}
