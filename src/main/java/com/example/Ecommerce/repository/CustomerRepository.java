package com.example.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.model.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
    Customer findByMobNo(String mobNo);
}
