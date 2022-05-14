package com.hotel.pet.services;

import com.hotel.pet.model.UserModel;
import com.hotel.pet.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServices {

    final UserRepository userRepository;

    public void salvarUser(UserModel userModel){
        userRepository.save(userModel);
    }
}
