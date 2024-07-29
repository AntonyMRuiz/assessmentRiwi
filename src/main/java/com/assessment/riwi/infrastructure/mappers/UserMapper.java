package com.assessment.riwi.infrastructure.mappers;

import com.assessment.riwi.domain.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants; // Add this import

import com.assessment.riwi.api.dtos.requests.UserRequest;
import com.assessment.riwi.api.dtos.responses.UserResponse;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper extends GenericMapper<UserRequest, UserResponse, UserEntity> {
}
