package com.hotel.pet.repositories;

import com.hotel.pet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional <User> findByEmail(String email);
    // Opcional é pq pode ser que n exista um usuario com este email
}
