package com.hotel.pet.controller;

import com.hotel.pet.model.Cuidador;
import com.hotel.pet.services.CuidadorServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cuidador")
public class CuidadorController {

    private final CuidadorServices cuidadorServices;

    @GetMapping("/listarCuidadores")
    public List<Cuidador> listarCuidadores(){return cuidadorServices.listarCuidadores();
    }

}
