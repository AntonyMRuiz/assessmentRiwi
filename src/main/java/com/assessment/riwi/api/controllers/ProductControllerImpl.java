package com.assessment.riwi.api.controllers;

import com.assessment.riwi.api.abstract_controllers.IProductController;
import com.assessment.riwi.api.dtos.responses.OrderResponse;
import com.assessment.riwi.api.dtos.responses.ProductResponse;
import com.assessment.riwi.infrastructure.abstract_services.IProductService;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

import org.springframework.data.domain.Page;

import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name="product")
@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductControllerImpl  implements IProductController {

    private final IProductService productService;

    @ApiResponse(
            responseCode = "200",
            description = "Successfully created the product",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ProductResponse.class))
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
    public ResponseEntity<Page<ProductResponse>> readAll( @RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "10") int size) {
            
            Page<ProductResponse> productPage = productService.readAll(page, size);
            return ResponseEntity.ok(productPage);
        }
    }
    

