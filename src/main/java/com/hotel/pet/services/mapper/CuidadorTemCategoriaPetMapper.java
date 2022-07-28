package com.hotel.pet.services.mapper;

import com.hotel.pet.dtos.request.CuidadorRequest;
import com.hotel.pet.model.CategoriaPet;
import com.hotel.pet.model.Cuidador;
import com.hotel.pet.model.CuidadorTemCategoriaPet;
import com.hotel.pet.model.IdsCuidadorECategoriaPet;
import lombok.Builder;
import lombok.experimental.UtilityClass;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@UtilityClass

public class CuidadorTemCategoriaPetMapper {

    public CuidadorTemCategoriaPet convert(Cuidador cuidador, CategoriaPet categoriaPet, CuidadorRequest. CategoriaPetRequest categoriaPetRequest) {
        return CuidadorTemCategoriaPet.builder()
                .idsCuidadorECategoriaPet(getId(cuidador.getId(),categoriaPet.getId()))
                .tamanho(categoriaPetRequest.getTamanho())
                .raca(categoriaPetRequest.getRaca())
                .peso((categoriaPetRequest.getPeso()))
                .cuidador(cuidador)
                .categoriaPets(categoriaPet)
                .build();
    }


    private  IdsCuidadorECategoriaPet getId(Long idCuidador, Long idCategoria) {

        return  IdsCuidadorECategoriaPet.builder()
                .idCategoriaPet(idCategoria)
                .idCuidador(idCuidador)
                .build();

    }
}
