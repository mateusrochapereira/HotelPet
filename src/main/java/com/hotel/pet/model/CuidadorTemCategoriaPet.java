package com.hotel.pet.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class CuidadorTemCategoriaPet {

    @EmbeddedId
    private IdsCuidadorECategoriaPet idsCuidadorECategoriaPet;


    @Column(name = "peso", nullable = false)
    private double peso;

    @Column(name = "tamanho", nullable = false)
    private double tamanho;


}

