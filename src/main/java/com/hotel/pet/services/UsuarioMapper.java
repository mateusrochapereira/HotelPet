package com.hotel.pet.services;

import com.hotel.pet.model.EnderecoModel;
import com.hotel.pet.model.TelefoneModel;
import com.hotel.pet.model.UserModel;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UsuarioMapper {

    public UserModel convert(UserModel userModelAtualizado, UserModel userModelDesatualizado){
        TelefoneModel telefoneAtualizado = userModelAtualizado.getTelefone();
        TelefoneModel telefoneModelDesatualizado = userModelDesatualizado.getTelefone();

        return UserModel.builder()
                .id(userModelDesatualizado.getId())
                .nome(userModelAtualizado.getNome())
                .senha(userModelAtualizado.getSenha())
                .sobreNome((userModelAtualizado.getSobreNome()))
                .cpf(userModelAtualizado.getCpf())
                .email(userModelAtualizado.getEmail())
                .telefone(getTelefone(telefoneModelDesatualizado.getId(), telefoneAtualizado))

                .build();
    }

    private static TelefoneModel getTelefone(Integer id, TelefoneModel telefoneAtualizado) {
        return TelefoneModel.builder()
                .id(id)
                .ddd(telefoneAtualizado.getDdd())
                .numero(telefoneAtualizado.getNumero())
                .build();
    }
}
