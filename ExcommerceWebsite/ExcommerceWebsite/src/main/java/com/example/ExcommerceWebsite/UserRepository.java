package com.example.ExcommerceWebsite;

import com.example.ExcommerceWebsite.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByEmail(String email);
}

