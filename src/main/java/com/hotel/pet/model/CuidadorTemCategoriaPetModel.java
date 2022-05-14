package com.hotel.pet.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;


@Builder
@RequiredArgsConstructor
@Getter
@Setter
public class CuidadorTemCategoriaPetModel {
    @Column(name = "id_tipo_pet", nullable = false)
    private long id_tipo_pet;

    @Column(name = "id_tipo_cuidador", nullable = false)
    private long id_tipo_cuidador;

    @Column(name = "peso", nullable = false)
    private double peso;

    @Column(name = "tamanho", nullable = false)
    private double tamanho;


}

