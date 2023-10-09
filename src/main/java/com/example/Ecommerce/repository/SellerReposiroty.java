package com.example.Ecommerce.repository;

import com.example.Ecommerce.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerReposiroty  extends JpaRepository<Seller ,Integer>
{
    Seller findByEmailId(String email);
}
