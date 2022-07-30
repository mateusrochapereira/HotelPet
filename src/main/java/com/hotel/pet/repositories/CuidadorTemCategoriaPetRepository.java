package com.hotel.pet.repositories;

import com.hotel.pet.model.CuidadorTemCategoriaPet;
import com.hotel.pet.model.IdsCuidadorECategoriaPet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuidadorTemCategoriaPetRepository extends JpaRepository<CuidadorTemCategoriaPet, IdsCuidadorECategoriaPet> {
}