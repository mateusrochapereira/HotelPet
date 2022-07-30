package com.hotel.pet.controller;

import com.hotel.pet.dtos.request.CuidadorRequest;
import com.hotel.pet.dtos.responses.CuidadorFiltroEnderecoResponse;
import com.hotel.pet.model.Cuidador;
import com.hotel.pet.services.CuidadorServices;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping
    @ResponseStatus(HttpStatus.OK)

    public void adicionar(@Valid  @RequestBody CuidadorRequest cuidadorRequest) {
        try {
            cuidadorServices.salvar(cuidadorRequest);
        } catch (ChangeSetPersister.NotFoundException e) { // criar um handle pra tiar os try catch
            throw new RuntimeException(e);
        }
    }
}
