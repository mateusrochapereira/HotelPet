package com.hotel.pet.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class IdsCuidadorECategoriaPet implements Serializable {

    @Column(name = "id_tipo_cuidador")
    private String idCuidador;
    @Column(name = "id_categoria_pet")
    private String idCategoriaPet;

    //   public IdsCuidadorECategoriaPet(Cuidador id_cuidador, CategoriaPet idCategoriaPet){

    //  }

}
