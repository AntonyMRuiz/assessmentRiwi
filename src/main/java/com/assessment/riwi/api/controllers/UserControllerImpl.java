package com.assessment.riwi.api.controllers;

import com.assessment.riwi.api.abstract_controllers.IUserController;
import com.assessment.riwi.api.dtos.requests.UserRequest;
import com.assessment.riwi.api.dtos.responses.UserResponse;
import com.assessment.riwi.infrastructure.abstract_services.IUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "Users")
@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserControllerImpl implements IUserController {

   @Autowired
   private final IUserService userService;



    @ApiResponse(
            responseCode = "200",
            description = "Successfully created the user",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponse.class))
    )
    @ApiResponse(
            responseCode = "400",
            description = "incorrect request format in invalid request",
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class)
                    )
            }
    )
    @ApiResponse(
            responseCode = "404",
            description = "id not found",
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class)
                    )
            }
    )
    @PostMapping
    @Operation(summary = "Create a new User", description = "Create a new user with . Returns the created user's details.")
    public ResponseEntity<UserResponse> create(
            @Validated @RequestBody UserRequest request) {
        return ResponseEntity.ok(this.userService.create(request));
    }

}
