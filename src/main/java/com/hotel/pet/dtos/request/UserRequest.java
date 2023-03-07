package com.hotel.pet.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private Integer id;

    @NotBlank(message = "{campo.email.invalido}")
    @Email(message = "{campo.email.invalido}")
    private String email;

    @NotBlank(message = "{campo.senha.obrigatorio}")
    private String senha;

    @NotBlank(message = "{campo.nome.obrigatorio}")
    private String nome;

    @NotBlank(message = "{campo.sobrenome.obrigatorio}")
    private String sobreNome;

    @NotBlank(message ="{campo.cpf.obrigatorio}")
    @CPF(message = "{campo.cpf.invalido}")
    private String cpf;

    @NotBlank(message = "{campo.telefone.obrigatorio}")
    private String telefone;
}
