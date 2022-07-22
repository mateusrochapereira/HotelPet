package com.hotel.pet.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CuidadorRequest {

    @NotBlank(message = " Descricao obrigatorio!")
    private String descricaoLocal;

    @NotBlank
    private String email;

    @Valid
    @NotNull
    private EnderecoRequest endereco;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor

    public static class EnderecoRequest {
        @NotBlank
        private String quadra;

        @NotBlank
        private String alameda;

        @NotBlank
        private String lote;

        @NotBlank
        private String bairro;

        @NotBlank
        private String cep;


    }


}
