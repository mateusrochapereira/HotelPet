package com.hotel.pet.controller;

import com.hotel.pet.dtos.request.UserRequest;
import com.hotel.pet.model.User;
import com.hotel.pet.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserServices userServices;

    @PostMapping
    public void adicionarUser(@Valid @RequestBody UserRequest userRequest) {
        userServices.salvarUser(userRequest);
    }

    @DeleteMapping("/removerUsuarioPorId/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerUsuario(@PathVariable Integer id) {
         userServices.removerUsuarioporId(id);
    }

    @GetMapping("/listarUsuarios")
    public List<User> listarUsuarios() {
        return userServices.listarUsuarios();
    }

    @PutMapping("/atualizacaoUsuario/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarUsuario(@PathVariable Integer id, @Valid @RequestBody UserRequest userRequest) {

        userServices.atualizarUsuario(id, userRequest);

    }
}

