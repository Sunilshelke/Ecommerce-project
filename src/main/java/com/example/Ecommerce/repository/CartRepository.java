package com.example.Ecommerce.repository;

import com.example.Ecommerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository  extends JpaRepository<Cart ,Integer>
{

}
