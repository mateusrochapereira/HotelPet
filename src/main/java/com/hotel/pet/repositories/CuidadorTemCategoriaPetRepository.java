package com.hotel.pet.repositories;

import com.hotel.pet.dtos.responses.CuidadorFiltroEnderecoResponse;
import com.hotel.pet.model.Cuidador;
import com.hotel.pet.model.CuidadorTemCategoriaPet;
import com.hotel.pet.model.IdsCuidadorECategoriaPet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CuidadorTemCategoriaPetRepository extends JpaRepository<CuidadorTemCategoriaPet, IdsCuidadorECategoriaPet> {


}