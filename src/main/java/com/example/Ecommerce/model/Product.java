package com.example.Ecommerce.model;

import com.example.Ecommerce.enums.ProductCategory;
import com.example.Ecommerce.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "product")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;


    String name;

    int price;

    int quantity;
    @Enumerated(EnumType.STRING)
    ProductCategory productCategory;

    @Enumerated(EnumType.STRING)
    ProductStatus productStatus;

    @ManyToOne
    @JoinColumn
    Seller seller;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    List<Item> itemList = new ArrayList<>();

}
