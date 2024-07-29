package com.assessment.riwi.api.abstract_controllers;

import com.assessment.riwi.api.abstract_controllers.generic.CreateController;
import com.assessment.riwi.api.dtos.requests.OrderRequest;
import com.assessment.riwi.api.dtos.responses.OrderResponse;

public interface IOrderController extends CreateController<OrderResponse, OrderRequest> {
}
