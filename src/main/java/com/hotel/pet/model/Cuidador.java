package com.hotel.pet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "cuidador")

public class Cuidador {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")

    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    // TODO: 30/07/2022 SEMPRE COLOCAR O PERSIST EM RELACIONAMENTOS COM TABELAS ENCADEADAS PARA NAO DA ERRO CASO ALGUMA ESTEJA VAZIA 
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @Column(name = "desc_local", nullable = false)
    private String desc_local;




}
