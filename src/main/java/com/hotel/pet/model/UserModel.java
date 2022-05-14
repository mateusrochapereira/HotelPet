package com.hotel.pet.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Builder

public class UserModel {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "nome",nullable = false)
    private String nome;

    @Column(name = "sobrenome", nullable = false)
    private String sobreNome;

    @Column(name = "cpf",nullable = false)
    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    private TelefoneModel telefone;

}
