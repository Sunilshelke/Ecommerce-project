package com.example.Ecommerce.Dto.RequestDto;


import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@Setter
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class CustomerRequestDto
{

    String name;

    String emailId;

    int age;

    String mobNo;

    String address;
}
