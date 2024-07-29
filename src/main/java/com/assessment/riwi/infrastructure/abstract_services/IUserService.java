package com.assessment.riwi.infrastructure.abstract_services;

import com.assessment.riwi.api.dtos.responses.UserResponse;
import com.assessment.riwi.infrastructure.abstract_services.generics.CreateService;
import com.assessment.riwi.api.dtos.requests.UserRequest;

public interface IUserService extends CreateService<UserRequest, UserResponse>{
    
}
