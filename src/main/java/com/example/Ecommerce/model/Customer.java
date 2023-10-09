package com.example.ecommerce.model;

import com.example.Ecommerce.model.Card;
import com.example.Ecommerce.model.Cart;
import com.example.Ecommerce.model.Ordered;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customer")
@FieldDefaults(level= AccessLevel.PRIVATE)
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @Column(unique = true)
    String emailId;

    Integer age;

    String address;

  @Column(unique = true)
    String mobNo;

  @OneToMany(mappedBy = "customer" ,cascade=CascadeType.ALL)
    List<Card>cards=new ArrayList<>();

  @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    Cart cart;

  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    List<Ordered>orderList=new ArrayList<>();




}