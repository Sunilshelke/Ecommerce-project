package com.example.Ecommerce.repository;

import com.example.Ecommerce.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository  extends JpaRepository<Item,Integer>
{
}
