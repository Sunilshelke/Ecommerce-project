package com.example.Ecommerce.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "item")
@Getter
@Builder
@Setter

public class Item
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;



    int requiredQuantity;

    @ManyToOne
    @JoinColumn
    Cart cart;

    @ManyToOne
    @JoinColumn
    Ordered orderd;

    @ManyToOne
    @JoinColumn
    Product product;
}
