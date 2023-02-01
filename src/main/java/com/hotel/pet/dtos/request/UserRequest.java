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

    @NotBlank(message = "Email obrigatório")
    @Email(message = "formato do email errado")
    private String email;

    @NotBlank(message = "Senha obrigatório")
    private String senha;

    @NotBlank(message = "Nome obrigatório")
    private String nome;

    @NotBlank(message = "SobreNome obrigatório")
    private String sobreNome;

    @NotBlank(message = "Cpf obrigatório")
    @CPF(message = "Cpf deve ter 11 digitos")
    private String cpf;

    @NotBlank(message = "Telefone obrigatório")
    private String telefone;
}
