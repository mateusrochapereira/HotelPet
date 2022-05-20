package com.hotel.pet.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator = "increment")

    @Column(name="id", nullable = false)
    private Integer id;

    @Column(name = "numero", nullable = false)
    private  Integer numero;

    @Column(name = "ddd", nullable = false)
    private Integer ddd;
}
