package com.hotel.pet.controller;

import com.hotel.pet.model.UserModel;
import com.hotel.pet.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserServices userServices;
    @PostMapping
    public  void adicionarUser(@RequestBody UserModel userModel){
        userServices.salvarUser(userModel);
    }
}
