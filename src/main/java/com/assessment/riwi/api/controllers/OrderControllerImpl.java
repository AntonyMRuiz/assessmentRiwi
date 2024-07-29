package com.assessment.riwi.api.controllers;

import com.assessment.riwi.api.abstract_controllers.IOrderController;
import com.assessment.riwi.api.dtos.requests.OrderRequest;
import com.assessment.riwi.api.dtos.responses.OrderResponse;
import com.assessment.riwi.api.dtos.responses.UserResponse;
import com.assessment.riwi.infrastructure.abstract_services.IOrderService;
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

@Tag(name = "Orders")
@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderControllerImpl implements IOrderController {

    @Autowired
    private final IOrderService orderService;

    @ApiResponse(
            responseCode = "200",
            description = "Successfully created the order",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = OrderResponse.class))
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
    @Override


    @PostMapping
    @Operation(summary = "Create a new order", description = "Create a new order with all the necessary data")

    public ResponseEntity<OrderResponse> create(
           @Validated @RequestBody OrderRequest request) {
        return ResponseEntity.ok(this.orderService.create(request));
    }
}
