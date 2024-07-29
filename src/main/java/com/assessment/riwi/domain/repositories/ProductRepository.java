package com.assessment.riwi.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.riwi.domain.entities.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

    
}