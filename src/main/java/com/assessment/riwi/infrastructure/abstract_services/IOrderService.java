package com.assessment.riwi.infrastructure.abstract_services;

import com.assessment.riwi.api.abstract_controllers.generic.CreateController;
import com.assessment.riwi.api.dtos.requests.OrderRequest;
import com.assessment.riwi.api.dtos.responses.OrderResponse;

public interface IOrderService extends CreateController<OrderRequest, OrderResponse> {
}
