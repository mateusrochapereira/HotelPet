package com.hotel.pet.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "quadra", nullable = false)
    private String quadra;

    @Column(name = "alameda", nullable = false)
    private String alameda;

    @Column(name = "bairo", nullable = false)
    private String bairro;

    @Column(name = "cep", nullable = false)
    private String cep;

    @Column(name = "lote", nullable = false)
    private String lote;

}
