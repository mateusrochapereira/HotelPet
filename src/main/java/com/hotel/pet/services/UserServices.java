package com.hotel.pet.services;

import com.hotel.pet.model.User;
import com.hotel.pet.model.exception.UserNaoEncontrado;
import com.hotel.pet.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServices {

    final UserRepository userRepository;

    public void salvarUser(User user) {
        userRepository.save(user);
    }

    public ResponseEntity<ResponseEntity> removerUsuarioporId(Integer id) {
        if (!userRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        userRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public List<User> listarUsuarios() {
        return userRepository.findAll();
    }

    public User atualizarUsuario(Integer id, User userAtualizado) {
        User userDesatualizado = userRepository.findById(id)
                .orElseThrow(UserNaoEncontrado::new);

        User usuarioBd = UsuarioMapper.convert(userAtualizado, userDesatualizado);
        return userRepository.save(usuarioBd);
    }
}

