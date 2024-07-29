package com.assessment.riwi.api.controllers;

import com.assessment.riwi.api.abstract_controllers.IDiscountController;
import com.assessment.riwi.api.dtos.requests.DiscountRequest;
import com.assessment.riwi.api.dtos.responses.DiscountResponse;
import org.springframework.http.ResponseEntity;

public class DiscountControllerImpl implements IDiscountController {
    @Override
    public ResponseEntity<DiscountResponse> create(DiscountRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<DiscountResponse> update(DiscountRequest request, Long aLong) {
        return null;
    }
}
