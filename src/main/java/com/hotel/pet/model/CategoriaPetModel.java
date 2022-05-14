package com.hotel.pet.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Builder
public class CategoriaPetModel {
   @Id
   @Column(name = "id",nullable = false)
   private long id;

    @Column(name = "tipo", nullable = false)
    private String tipo;
}
