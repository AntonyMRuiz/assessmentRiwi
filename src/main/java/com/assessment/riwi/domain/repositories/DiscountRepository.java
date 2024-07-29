package com.assessment.riwi.domain.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.riwi.domain.entities.Discount;

public interface DiscountRepository extends JpaRepository<Discount, Long>  {

}