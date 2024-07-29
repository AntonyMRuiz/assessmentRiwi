package com.assessment.riwi.api.abstract_controllers;

import com.assessment.riwi.api.abstract_controllers.generic.CreateController;
import com.assessment.riwi.api.abstract_controllers.generic.DeleteByIdController;
import com.assessment.riwi.api.dtos.requests.UserRequest;
import com.assessment.riwi.api.dtos.responses.UserResponse;

public interface IUserController extends
        CreateController<UserResponse, UserRequest> {
}
