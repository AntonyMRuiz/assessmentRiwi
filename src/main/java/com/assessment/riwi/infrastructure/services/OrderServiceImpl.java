package com.assessment.riwi.infrastructure.services;

import com.assessment.riwi.api.dtos.requests.OrderRequest;
import com.assessment.riwi.api.dtos.responses.OrderResponse;
import com.assessment.riwi.infrastructure.abstract_services.IOrderService;
import org.springframework.http.ResponseEntity;

public class OrderServiceImpl implements IOrderService {
    @Override
    public ResponseEntity<OrderRequest> create(OrderResponse request) {
        return null;
    }
}
