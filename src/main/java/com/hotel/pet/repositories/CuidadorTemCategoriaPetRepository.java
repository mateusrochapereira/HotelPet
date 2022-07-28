package com.hotel.pet.repositories;

import com.hotel.pet.model.CuidadorTemCategoriaPet;
import com.hotel.pet.model.IdsCuidadorECategoriaPet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuidadorTemCategoriaPetRepository extends JpaRepository<CuidadorTemCategoriaPet, IdsCuidadorECategoriaPet> {
}