package com.hotel.pet.controller;

import com.hotel.pet.model.UserModel;
import com.hotel.pet.model.exception.UserNaoEncontrado;
import com.hotel.pet.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserServices userServices;

    @PostMapping
    public void adicionarUser(@RequestBody UserModel userModel) {
        userServices.salvarUser(userModel);
    }

    @DeleteMapping("/removerUsuarioPorId/{id}")
    public ResponseEntity<ResponseEntity> removerUsuario(@PathVariable Integer id) {
        return userServices.removerUsuarioporId(id);
    }

    @GetMapping("/listarUsuarios")
    public List<UserModel> listarUsuarios() {
        return userServices.listarUsuarios();
    }

    @PutMapping("atualizacaoUsuario/{id}")
    public ResponseEntity<UserModel> atualizarUsuario(@PathVariable Integer id, @RequestBody  UserModel userModel) {
        try {
            UserModel userModelAtualizado = userServices.atualizarUsuario(id, userModel);
            return  ResponseEntity.ok(userModelAtualizado);
        } catch (UserNaoEncontrado u) {
            return ResponseEntity.notFound().build();
        }
    }
}
