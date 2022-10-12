package com.hotel.pet.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "categoria_pet")
public class CategoriaPet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "tipo", nullable = false)
    private String tipo;


}
