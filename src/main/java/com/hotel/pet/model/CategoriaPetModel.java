package com.hotel.pet.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaPetModel {
   @Id
   @Column(name = "id",nullable = false)
   private Long id;

    @Column(name = "tipo", nullable = false)
    private String tipo;
}
