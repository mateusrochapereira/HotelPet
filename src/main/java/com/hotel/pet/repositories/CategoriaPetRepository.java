package com.hotel.pet.repositories;

import com.hotel.pet.dtos.responses.CategoriaPetHomeResponse;
import com.hotel.pet.model.CategoriaPet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface  CategoriaPetRepository extends JpaRepository<CategoriaPet, Long> {
    //@Query("SELECT new com.hotel.pet.dtos.responses.CategoriaPetHomeResponse(c.id,c.tipo) from CategoriaPet c")
    @Query("SELECT new com.hotel.pet.dtos.responses.CategoriaPetHomeResponse(c.id,c.tipo) "
            + "from CategoriaPet c"
            + " where upper(c.tipo) like upper(concat('%', ?1, '%'))")
    List<CategoriaPetHomeResponse> findByCategoriaPet(String  categoriaPet);
}
