package com.example.Ecommerce.Controller;

import com.example.Ecommerce.Dto.RequestDto.ProductRequestDto;
import com.example.Ecommerce.Dto.ResponseDto.ProductResponseDto;
import com.example.Ecommerce.Service.ProductService;
import com.example.Ecommerce.enums.ProductCategory;
import com.example.Ecommerce.exeptions.InvalidSellerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public ProductResponseDto addProduct(@RequestBody ProductRequestDto productRequestDto) throws InvalidSellerException {

        return productService.addProduct(productRequestDto);
    }

    // get all products of a particular category
    @GetMapping("/get/{category}")
    public List<ProductResponseDto> getAllProductsByCategory(@PathVariable("category") ProductCategory category){
        return productService.getAllProductsByCategory(category);
    }

    @GetMapping("/get/{price}/{category}")
    public List<ProductResponseDto> getAllProductsByPriceAndCategory(
            @PathVariable("price") int price,
            @PathVariable("category") String productCategory){

        return productService.getAllProductsByPriceAndCategory(price, productCategory);
    }

    // Get all product by seller email id

    // delete a product by seller id and product id

    // return top 5 cheapest products

    // return top 5 costliest products

    // return all out of stock products

    // return all available products

    // return all products that have quantity less than 10

    // return the cheapest product in a particular category

    // return the costliest product in a particular category
}