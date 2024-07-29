package com.assessment.riwi.api.abstract_controllers;

import com.assessment.riwi.api.abstract_controllers.generic.CreateController;
import com.assessment.riwi.api.abstract_controllers.generic.DeleteByIdController;
import com.assessment.riwi.api.abstract_controllers.generic.UpdateByIdController;
import com.assessment.riwi.api.dtos.requests.DiscountRequest;
import com.assessment.riwi.api.dtos.responses.DiscountResponse;

public interface IDiscountController extends
        CreateController<DiscountResponse, DiscountRequest>,
        DeleteByIdController<Long>,
        UpdateByIdController<DiscountResponse, DiscountRequest, Long> {
}
