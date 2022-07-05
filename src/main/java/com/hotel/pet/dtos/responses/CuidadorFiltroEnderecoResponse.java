package com.hotel.pet.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CuidadorFiltroEnderecoResponse {
    private String nomeCompleto;
    private String quadra;
    private String alameda;
}
