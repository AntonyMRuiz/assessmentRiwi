package com.assessment.riwi.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.riwi.api.dtos.requests.UserRequest;
import com.assessment.riwi.api.dtos.responses.UserResponse;
import com.assessment.riwi.domain.entities.UserEntity;
import com.assessment.riwi.domain.repositories.UserRepository;
import com.assessment.riwi.infrastructure.abstract_services.IUserService;
import com.assessment.riwi.infrastructure.mappers.UserMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserResponse create(UserRequest request) {

        UserEntity user = this.userMapper.toEntity(request);
        return this.userMapper.toResponse(this.userRepository.save(user));

    }
}
