package com.vk.shop.backend.data.repositories;

import com.vk.shop.backend.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
