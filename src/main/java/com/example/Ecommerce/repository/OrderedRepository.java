package com.example.Ecommerce.repository;

import com.example.Ecommerce.enums.ProductCategory;
import com.example.Ecommerce.model.Product;
import org.springframework.core.Ordered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderedRepository  extends JpaRepository<Ordered , Integer>
{

}
