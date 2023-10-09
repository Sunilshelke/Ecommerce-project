package com.example.Ecommerce.repository;

import com.example.Ecommerce.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card , Integer>
{
    Card findByCardNo(String cardNo);
}
