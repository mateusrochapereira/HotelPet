package com.hotel.pet.services;

import com.hotel.pet.model.UserModel;
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

    public void salvarUser(UserModel userModel){
        userRepository.save(userModel);
    }

    public ResponseEntity<ResponseEntity> removerUsuarioporId(Integer id) {
        if (!userRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        userRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public List<UserModel> listarUsuarios() {
        return userRepository.findAll();
    }

    public UserModel atualizarUsuario(Integer id, UserModel userModelAtualizado) {
        UserModel userModelDesatualizado = userRepository.findById(id)
                .orElseThrow(UserNaoEncontrado::new);

        UserModel usuarioBd = UsuarioMapper.convert(userModelAtualizado, userModelDesatualizado);
        return  userRepository.save(usuarioBd);
    }
}

