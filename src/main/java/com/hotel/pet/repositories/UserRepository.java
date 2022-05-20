package com.hotel.pet.repositories;

import com.hotel.pet.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer > {
}
