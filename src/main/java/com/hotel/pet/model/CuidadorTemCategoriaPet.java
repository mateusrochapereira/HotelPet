package com.hotel.pet.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;


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

    @Column(name="raca", nullable = false)
    private String raca;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_categoria_pet", insertable = false, updatable = false)
    private CategoriaPet categoriaPets;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_tipo_cuidador", insertable = false, updatable = false)
    private Cuidador cuidador;

}

