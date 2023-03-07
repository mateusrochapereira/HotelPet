package com.hotel.pet.services;

import com.hotel.pet.dtos.request.UserRequest;
import com.hotel.pet.model.User;
import com.hotel.pet.model.exception.UserNaoEncontradoException;
import com.hotel.pet.repositories.UserRepository;
import com.hotel.pet.services.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServices {

    final UserRepository userRepository;

    public void salvarUser(UserRequest userRequest) {
        User user = UserMapper.convert(userRequest);

        userRepository.save(user);

    }

    public void removerUsuarioporId(Integer id) {

        userRepository.findById(id)
                .map(usuario -> {
                    userRepository.delete(usuario);
                    return usuario;
                }).orElseThrow(() ->
                          new UserNaoEncontradoException());
                                //ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario não encontrado"));

    }

    public List<User> listarUsuarios() {
        return userRepository.findAll();
    }

    public void atualizarUsuario(Integer id, UserRequest userRequest) {
        User user = new User();
        userRepository.findById(id)
                .map(usuarioExistente -> {
                    user.setId(usuarioExistente.getId());
                    User usuarioBd = UserMapper.convertParaAtualizar(userRequest, user);
                    userRepository.save(usuarioBd);
                    return usuarioExistente;
                }).orElseThrow(() ->
                        new UserNaoEncontradoException() );
                                //ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não existe"));


    }

}