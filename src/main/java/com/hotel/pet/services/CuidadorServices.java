package com.hotel.pet.services;

import com.hotel.pet.dtos.request.CuidadorRequest;
import com.hotel.pet.dtos.responses.CuidadorFiltroEnderecoResponse;
import com.hotel.pet.model.Cuidador;
import com.hotel.pet.model.User;
import com.hotel.pet.repositories.CuidadorRepository;
import com.hotel.pet.repositories.UserRepository;
import com.hotel.pet.services.mapper.CuidadorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CuidadorServices {
    private final CuidadorRepository cuidadorRepository;
    private final UserRepository userRepository;

    public List<Cuidador> listarCuidadores() {
        return cuidadorRepository.findAll();
    }

    public List<CuidadorFiltroEnderecoResponse> listarTodosPorEnderco(String endereco) {
        return cuidadorRepository.findByEndereco(endereco);
    }

    public void salvar(CuidadorRequest cuidadorRequest) throws ChangeSetPersister.NotFoundException {
        User user = userRepository.findByEmail(cuidadorRequest.getEmail())
                .orElseThrow(
                        ChangeSetPersister.NotFoundException::new); //Trocar por uma exececao CuidadorNaoEncontradoException
//pergunatr pro victtor por que cuidador e nao CUidador reqeust;
        Cuidador cuidador = CuidadorMapper.convert(cuidadorRequest, user);
        cuidadorRepository.save(cuidador);

    }
}
