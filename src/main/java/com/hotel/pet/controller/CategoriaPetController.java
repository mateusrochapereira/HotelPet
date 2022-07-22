package com.hotel.pet.controller;

import com.hotel.pet.dtos.responses.CategoriaPetHomeResponse;
import com.hotel.pet.services.CategoriaPetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categorias")
public class CategoriaPetController {
    private final CategoriaPetService categoriaPetService;

    @GetMapping("/home")
    @ResponseStatus(HttpStatus.OK)
    public List<CategoriaPetHomeResponse> buscarCategoriaPetHome(@RequestParam String categoriaPet){
        return   categoriaPetService.buscarTodosResumido(categoriaPet);

    }
}
