package com.hotel.pet.services;

import com.hotel.pet.dtos.request.UserDto;
import com.hotel.pet.model.User;
import com.hotel.pet.model.exception.UserNaoEncontrado;
import com.hotel.pet.repositories.UserDtoRepository;
import com.hotel.pet.repositories.UserRepository;
import com.hotel.pet.services.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServices {

        final UserRepository userRepository;
         final UsuarioMapper usuarioMapper;
    final
        public void salvarUser(UserDto userDto) {
           User user  = UsuarioMapper.convert(userDto);
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

