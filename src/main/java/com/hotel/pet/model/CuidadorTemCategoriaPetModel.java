package com.hotel.pet.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CuidadorTemCategoriaPetModel {
    @Column(name = "id_tipo_pet", nullable = false)
    private Long id_tipo_pet;

    @Column(name = "id_tipo_cuidador", nullable = false)
    private Long id_tipo_cuidador;

    @Column(name = "peso", nullable = false)
    private double peso;

    @Column(name = "tamanho", nullable = false)
    private double tamanho;


}

