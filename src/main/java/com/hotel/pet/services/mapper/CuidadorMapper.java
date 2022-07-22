package com.hotel.pet.services.mapper;

import com.hotel.pet.dtos.request.CuidadorRequest;
import com.hotel.pet.model.Cuidador;
import com.hotel.pet.model.Endereco;
import com.hotel.pet.model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CuidadorMapper {

    public Cuidador convert(CuidadorRequest cuidadorRequest, User user) {
        return Cuidador.builder()
                .user(user)
                .descLocal(cuidadorRequest.getDescricaoLocal())
                .endereco(getEndereco(cuidadorRequest.getEndereco()))
                .build();
    }

    private Endereco getEndereco(CuidadorRequest.EnderecoRequest endereco) {
        return Endereco.builder()
                .cep(endereco.getCep())
                .quadra(endereco.getQuadra())
                .alameda(endereco.getAlameda())
                .lote(endereco.getLote())
                .bairro(endereco.getBairro())

                .build();
    }
}
