package com.hotel.pet.services;

import com.hotel.pet.dtos.responses.CategoriaPetHomeResponse;
import com.hotel.pet.repositories.CategoriaPetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaPetService {
    private final CategoriaPetRepository categoriaPetRepository;


    public List<CategoriaPetHomeResponse> buscarTodosResumido(String  categoriaPet) {
        return categoriaPetRepository.findByCategoriaPet(categoriaPet);
    }
}
