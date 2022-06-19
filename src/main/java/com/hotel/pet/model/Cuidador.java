package com.hotel.pet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "cuidador")

public class Cuidador {
    @JsonIgnore
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    private User user;

    @OneToOne
    private Endereco endereco;

    @Column(name = "desc_local", nullable = false)
    private String desc_local;

    @OneToMany
    @JoinColumn(name = "id_tipo_cuidador")

    private List<CuidadorTemCategoriaPet> cuidadorTemCategoriaPets;


}
