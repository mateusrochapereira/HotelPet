package com.hotel.pet.dtos;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class ApiErros {
    @Getter
    private List<String> erros;

    public ApiErros(List<String> erros) {
        this.erros = erros;
    }

    public ApiErros(String messagemErro){ this.erros = Arrays.asList(messagemErro); }
}
