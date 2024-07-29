package com.assessment.riwi.api.controllers;

import com.assessment.riwi.api.abstract_controllers.IUserController;
import com.assessment.riwi.api.dtos.requests.UserRequest;
import com.assessment.riwi.api.dtos.responses.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserControllerImpl implements IUserController {
    @Override
    public ResponseEntity<UserResponse> create(UserRequest request) {
        return null;
    }

}
