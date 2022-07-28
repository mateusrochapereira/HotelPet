package com.hotel.pet.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "id", nullable = false)
    private Integer id;

    // TODO: 27/07/2022 fazer alteracao no scrip do abnco pro email ficar UNIQUE
    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "sobrenome", nullable = false)
    private String sobreNome;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_telefone")
    private Telefone telefone;

}
