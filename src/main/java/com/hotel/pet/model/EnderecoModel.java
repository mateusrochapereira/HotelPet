package com.hotel.pet.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class EnderecoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "quadra", nullable = false)
    private String quadra;

    @Column(name = "alameda", nullable = false)
    private String alameda;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "cep", nullable = false)
    private String cep;

    @Column(name = "lote", nullable = false)
    private String lote;

}
