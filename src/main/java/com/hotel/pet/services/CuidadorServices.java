package com.hotel.pet.services;

import com.hotel.pet.dtos.request.CuidadorRequest;
import com.hotel.pet.dtos.responses.CuidadorFiltroEnderecoResponse;
import com.hotel.pet.model.CategoriaPet;
import com.hotel.pet.model.Cuidador;
import com.hotel.pet.model.CuidadorTemCategoriaPet;
import com.hotel.pet.model.User;
import com.hotel.pet.repositories.CategoriaPetRepository;
import com.hotel.pet.repositories.CuidadorRepository;
import com.hotel.pet.repositories.CuidadorTemCategoriaPetRepository;
import com.hotel.pet.repositories.UserRepository;
import com.hotel.pet.services.mapper.CategoriaPetMapper;
import com.hotel.pet.services.mapper.CuidadorMapper;
import com.hotel.pet.services.mapper.CuidadorTemCategoriaPetMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CuidadorServices {
    private final CuidadorRepository cuidadorRepository;
    private final UserRepository userRepository;
    private final CuidadorTemCategoriaPetRepository cuidadorCategoriaPetRepository;
    private final CategoriaPetRepository categoriaPetRepository;

    public List<Cuidador> listarCuidadores() {
        return cuidadorRepository.findAll();
    }

    public List<CuidadorFiltroEnderecoResponse> listarTodosPorEnderco(String endereco) {
        return cuidadorRepository.findByEndereco(endereco);
    }

    @Transactional
    public void salvar(CuidadorRequest cuidadorRequest) throws ChangeSetPersister.NotFoundException {
        User user = userRepository.findByEmail(cuidadorRequest.getEmail())
                .orElseThrow(
                        ChangeSetPersister.NotFoundException::new); //Trocar por uma exececao CuidadorNaoEncontradoException
        Cuidador cuidador = CuidadorMapper.convert(cuidadorRequest, user);
        cuidadorRepository.save(cuidador);

       CategoriaPet categoriaPet = CategoriaPetMapper.convert(cuidadorRequest.getCategoriaPetRequest());
       categoriaPetRepository.save(categoriaPet);


       CuidadorTemCategoriaPet cuidadorTemCategoriaPet = CuidadorTemCategoriaPetMapper.convert(cuidador, categoriaPet, cuidadorRequest.getCategoriaPetRequest());

      cuidadorCategoriaPetRepository.save(cuidadorTemCategoriaPet);

    }
}
