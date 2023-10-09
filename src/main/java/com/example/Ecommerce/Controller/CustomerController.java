package com.example.Ecommerce.Controller;

import com.example.Ecommerce.Dto.RequestDto.CustomerRequestDto;
import com.example.Ecommerce.Dto.ResponseDto.CustomerResponseDto;
import com.example.Ecommerce.Service.CustomerService;
import com.example.Ecommerce.exeptions.MobileNoAlreadyPresentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer")
public class CustomerController
{
    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public CustomerResponseDto addCustomer (@RequestBody CustomerRequestDto customerRequestDto) throws MobileNoAlreadyPresentException {
        return customerService.addCustomer(customerRequestDto);

    }

}
