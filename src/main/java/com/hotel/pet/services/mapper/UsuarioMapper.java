package com.hotel.pet.services.mapper;

import com.hotel.pet.model.Telefone;
import com.hotel.pet.model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UsuarioMapper {

    public User convert(User userAtualizado, User userDesatualizado) {

        return User.builder()
                .id(userDesatualizado.getId())
                .nome(userAtualizado.getNome())
                .senha(userAtualizado.getSenha())
                .sobreNome((userAtualizado.getSobreNome()))
                .cpf(userAtualizado.getCpf())
                .email(userAtualizado.getEmail())
                .telefone(userAtualizado.getTelefone())

                .build();
    }
}
