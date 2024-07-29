package com.assessment.riwi.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.riwi.domain.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}