package com.hotel.pet.services;

import com.hotel.pet.model.Telefone;
import com.hotel.pet.model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UsuarioMapper {

    public User convert(User userAtualizado, User userDesatualizado) {
        Telefone telefoneAtualizado = userAtualizado.getTelefone();
        Telefone telefoneDesatualizado = userDesatualizado.getTelefone();

        return User.builder()
                .id(userDesatualizado.getId())
                .nome(userAtualizado.getNome())
                .senha(userAtualizado.getSenha())
                .sobreNome((userAtualizado.getSobreNome()))
                .cpf(userAtualizado.getCpf())
                .email(userAtualizado.getEmail())
                .telefone(getTelefone(telefoneDesatualizado.getId(), telefoneAtualizado))

                .build();
    }

    private static Telefone getTelefone(Integer id, Telefone telefoneAtualizado) {
        return Telefone.builder()
                .id(id)
                .ddd(telefoneAtualizado.getDdd())
                .numero(telefoneAtualizado.getNumero())
                .build();
    }
}
