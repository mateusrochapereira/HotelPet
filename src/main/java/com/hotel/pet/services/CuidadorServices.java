package com.hotel.pet.services;

import com.hotel.pet.model.Cuidador;
import com.hotel.pet.model.User;
import com.hotel.pet.repositories.CuidadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CuidadorServices {
    private final CuidadorRepository cuidadorRepository;
    public List<Cuidador> listarCuidadores() {
        return cuidadorRepository.findAll();
    }
}
