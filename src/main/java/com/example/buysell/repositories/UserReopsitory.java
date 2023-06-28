package com.example.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.buysell.models.User;
import java.util.List;


public interface UserReopsitory extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
