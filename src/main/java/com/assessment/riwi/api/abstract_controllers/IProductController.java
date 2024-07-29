package com.assessment.riwi.api.abstract_controllers;

import com.assessment.riwi.api.abstract_controllers.generic.ReadAllController;
import com.assessment.riwi.api.dtos.responses.ProductResponse;

public interface IProductController extends
        ReadAllController <ProductResponse> {
}
