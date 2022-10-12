package com.hotel.pet.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IdsCuidadorECategoriaPet implements Serializable {

    @Column(name = "id_tipo_cuidador")
    private Long idCuidador;
    @Column(name = "id_categoria_pet")
    private Long idCategoriaPet;

    //   public IdsCuidadorECategoriaPet(Cuidador id_cuidador, CategoriaPet idCategoriaPet){

    //  }

}
