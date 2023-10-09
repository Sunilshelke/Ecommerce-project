package com.example.Ecommerce.exeptions;

public class InvalidCustomerException extends  Exception
{
     public InvalidCustomerException(String messeage)
     {
         super(messeage);
     }
}
