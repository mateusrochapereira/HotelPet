package com.hotel.pet.controller;

import com.hotel.pet.dtos.request.UserRequest;
import com.hotel.pet.model.User;
import com.hotel.pet.model.exception.UserNaoEncontrado;
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
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionarUser(@RequestBody @Valid UserRequest userRequest) {
        userServices.salvarUser(userRequest);
    }

    @DeleteMapping("/removerUsuarioPorId/{id}")
    public ResponseEntity<ResponseEntity> removerUsuario(@PathVariable Integer id) {
        return userServices.removerUsuarioporId(id);
    }

    @GetMapping("/listarUsuarios")
    public List<User> listarUsuarios() {
        return userServices.listarUsuarios();
    }

    @PutMapping("atualizacaoUsuario/{id}")
    public ResponseEntity<User> atualizarUsuario(@PathVariable Integer id, @RequestBody User user) {
        try {
            User userAtualizado = userServices.atualizarUsuario(id, user);
            return ResponseEntity.ok(userAtualizado);
        } catch (UserNaoEncontrado u) {
            return ResponseEntity.notFound().build();
        }
    }
}
