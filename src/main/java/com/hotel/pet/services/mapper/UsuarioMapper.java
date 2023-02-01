package com.hotel.pet.services.mapper;

import com.hotel.pet.dtos.request.UserDto;
import com.hotel.pet.model.Telefone;
import com.hotel.pet.model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UsuarioMapper {

    public User convert(UserDto userdto) {

        return User.builder()
                .id(user.getId())
                .nome(userdto.getNome())
                .senha(userdto.getSenha())
                .sobreNome((userdto.getSobreNome()))
                .cpf(userdto.getCpf())
                .email(userdto.getEmail())
                .telefone(userdto.getTelefone())

                .build();
    }

    private User getId(UserDto.)
}
