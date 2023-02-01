package com.hotel.pet.services.mapper;

import com.hotel.pet.dtos.request.UserRequest;
import com.hotel.pet.model.Telefone;
import com.hotel.pet.model.User;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class UsuarioMapper {
    private ModelMapper modelMapper;

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

    public UserRequest toModel(User user){
        return modelMapper.map(user, UserRequest.class);
    }
}
