package com.example.Ecommerce.model;
import com.example.ecommerce.model.Customer;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "orderd")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ordered
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String orderNo;
    int totalValue;

    @CreationTimestamp
    Date OrderDate;

    String cardUsed;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    List<Item>items=new ArrayList<>();

    @ManyToOne
    @JoinColumn
    Customer customer;


}
