package com.example.Ecommerce.exeptions;

public class EmailAlreadyPresentException extends  Exception
{
    public EmailAlreadyPresentException(String message){
        super(message);
    }
}
