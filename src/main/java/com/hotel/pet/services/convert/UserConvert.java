package com.hotel.pet.services.convert;

import com.hotel.pet.dtos.request.UserRequest;
import com.hotel.pet.model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConvert {
    public User convert(UserRequest userRequest) {
        return User.builder()
                .cpf(userRequest.getCpf())
                .email(userRequest.getEmail())
                .senha(userRequest.getSenha())
                .nome(userRequest.getNome())
                .sobreNome(userRequest.getNome())
                .telefone(userRequest.getNome())
                .build();
    }
}
