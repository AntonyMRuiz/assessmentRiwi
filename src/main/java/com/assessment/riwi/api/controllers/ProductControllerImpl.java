package com.assessment.riwi.api.controllers;

import com.assessment.riwi.api.abstract_controllers.IProductController;
import com.assessment.riwi.api.dtos.responses.ProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class ProductControllerImpl  implements IProductController {
    @Override
    public ResponseEntity<ProductResponse> create(ProductResponse request) {
        return null;
    }
}
