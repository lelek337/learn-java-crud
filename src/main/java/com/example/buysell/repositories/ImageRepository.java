package com.example.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.buysell.models.Images;

public interface ImageRepository extends JpaRepository<Images, Long> {
    
}
