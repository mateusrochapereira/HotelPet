package com.hotel.pet.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuidadorModel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;


    //private UserModel user;

    @OneToOne
    private EnderecoModel endereco;

    @Column(name = "desc_local", nullable = false)
    private String desc_local;

    //OneToMany
    //private CuidadorTemCategoriaPetModel temCategoriaPetModel;
}
