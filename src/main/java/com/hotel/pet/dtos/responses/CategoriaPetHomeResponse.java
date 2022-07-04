package com.hotel.pet.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaPetHomeResponse {
    private Long id;
    private String nome;
}
