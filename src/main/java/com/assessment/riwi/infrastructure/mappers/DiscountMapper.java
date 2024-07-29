package com.assessment.riwi.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.assessment.riwi.api.dtos.requests.DiscountRequest;
import com.assessment.riwi.api.dtos.responses.DiscountResponse;
import com.assessment.riwi.domain.entities.Discount;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DiscountMapper extends GenericMapper<DiscountRequest, DiscountResponse, Discount> {
    
}
