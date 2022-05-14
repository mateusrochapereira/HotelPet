package com.hotel.pet.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@RequiredArgsConstructor
public class CuidadorModel {
    @Id
    @Column(name = "id", nullable = false)
    private long id;


    //private UserModel user;

    @OneToOne
    private EnderecoModel endereco;

    @Column(name = "desc_local", nullable = false)
    private String desc_local;

    //OneToMany
    //private CuidadorTemCategoriaPetModel temCategoriaPetModel;
}
