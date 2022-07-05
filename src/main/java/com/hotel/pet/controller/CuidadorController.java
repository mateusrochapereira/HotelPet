package com.hotel.pet.controller;

import com.hotel.pet.dtos.responses.CuidadorFiltroEnderecoResponse;
import com.hotel.pet.model.Cuidador;
import com.hotel.pet.services.CuidadorServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cuidadores")
public class CuidadorController {

    private final CuidadorServices cuidadorServices;

    @GetMapping("/listarCuidadores")
    public List<Cuidador> listarCuidadores(){return cuidadorServices.listarCuidadores();
    }

    @GetMapping("/findByEndereco")
    @ResponseStatus(HttpStatus.OK)
    public List<CuidadorFiltroEnderecoResponse> listarPorEndereco(
            @RequestParam String endereco) {


        return cuidadorServices.listarTodosPorEnderco(endereco);
    }

}
