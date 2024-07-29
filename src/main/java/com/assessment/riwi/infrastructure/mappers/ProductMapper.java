package com.assessment.riwi.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.assessment.riwi.api.dtos.requests.ProductRequest;
import com.assessment.riwi.api.dtos.responses.ProductResponse;
import com.assessment.riwi.domain.entities.Products;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper extends GenericMapper<ProductRequest, ProductResponse, Products> {
    
}
