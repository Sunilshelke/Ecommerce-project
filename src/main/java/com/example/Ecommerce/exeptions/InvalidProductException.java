package com.example.Ecommerce.exeptions;

public class InvalidProductException extends  Exception
{
    public InvalidProductException(String messeage)
    {
        super(messeage);
    }
}
