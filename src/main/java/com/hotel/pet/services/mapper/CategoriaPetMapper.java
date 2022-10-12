package com.hotel.pet.services.mapper;

import com.hotel.pet.dtos.request.CuidadorRequest;
import com.hotel.pet.model.CategoriaPet;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CategoriaPetMapper {

    public  CategoriaPet convert(CuidadorRequest.CategoriaPetRequest categoriaPetRequest) {
        return CategoriaPet.builder()
                .tipo(categoriaPetRequest.getTipo())



                .build();


    }
}
