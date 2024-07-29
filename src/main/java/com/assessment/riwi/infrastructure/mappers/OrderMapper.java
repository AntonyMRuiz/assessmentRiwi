package com.assessment.riwi.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.assessment.riwi.api.dtos.requests.OrderRequest;
import com.assessment.riwi.api.dtos.responses.OrderResponse;
import com.assessment.riwi.domain.entities.Order;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper extends GenericMapper<OrderRequest, OrderResponse, Order> {   
}
