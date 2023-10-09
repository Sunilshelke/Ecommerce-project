package com.example.Ecommerce.Dto.RequestDto;


import com.example.Ecommerce.enums.CardType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Builder
public class CardRequestDto {

    String mobNo;

    String cardNo;

    Integer cvv;

    Date expiryDate;


    CardType cardType;
}
