package com.assessment.riwi.domain.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.riwi.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

    
}