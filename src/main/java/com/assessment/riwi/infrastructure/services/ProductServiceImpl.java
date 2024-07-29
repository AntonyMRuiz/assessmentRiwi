package com.assessment.riwi.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.assessment.riwi.api.dtos.responses.ProductResponse;
import com.assessment.riwi.domain.repositories.ProductRepository;
import com.assessment.riwi.infrastructure.abstract_services.IProductService;
import com.assessment.riwi.infrastructure.mappers.ProductMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Page<ProductResponse> readAll(int page, int size) {
        if(page < 0)
            page = 0;
        PageRequest pagination = PageRequest.of(page, size);

        return this.productRepository.findAll(pagination)
            .map(this.productMapper::toResponse);
    }


}
