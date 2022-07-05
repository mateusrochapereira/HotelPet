package com.hotel.pet.repositories;

import com.hotel.pet.dtos.responses.CuidadorFiltroEnderecoResponse;
import com.hotel.pet.model.Cuidador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CuidadorRepository extends JpaRepository<Cuidador, Long> {

    @Query(
            "select  new com.hotel.pet.dtos.responses.CuidadorFiltroEnderecoResponse(concat(u.nome,' ',u.sobreNome ), e.quadra, e.alameda)"
                    + " from Cuidador c"
                    + " join c.user u"
                    + " join c.endereco e"
                    + " where upper(e.quadra) like upper(concat('%', ?1, '%'))"
                    + " or upper(e.alameda) like upper(concat('%', ?1, '%'))"
                    + " or upper(e.cep) like upper(concat('%', ?1, '%'))")
    List<CuidadorFiltroEnderecoResponse> findByEndereco(String endereco);
}
