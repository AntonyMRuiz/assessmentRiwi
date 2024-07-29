package com.assessment.riwi.infrastructure.abstract_services;

import com.assessment.riwi.api.dtos.requests.DiscountRequest;
import com.assessment.riwi.api.dtos.responses.DiscountResponse;
import com.assessment.riwi.infrastructure.abstract_services.generics.*;

public interface IDiscountService
        extends
            CreateService<DiscountRequest, DiscountResponse>,
            ReadAllService<DiscountResponse>,
            UpdateByIdService<DiscountRequest, DiscountResponse, Long>,
            DeleteByIdService<Long> {
}
