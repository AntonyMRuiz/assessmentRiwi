package com.assessment.riwi.infrastructure.services;

import com.assessment.riwi.api.dtos.requests.DiscountRequest;
import com.assessment.riwi.api.dtos.responses.DiscountResponse;
import com.assessment.riwi.domain.repositories.DiscountRepository;
import com.assessment.riwi.infrastructure.abstract_services.IDiscountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DiscountServiceImpl implements IDiscountService {

    @Autowired
    private final DiscountRepository discountRepository;

    @Override
    public DiscountResponse create(DiscountRequest request) {
        return discountRepository.save();
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Page<DiscountResponse> readAll(int page, int size) {
        return null;
    }

    @Override
    public DiscountResponse updateById(Long aLong, DiscountRequest request) {
        return null;
    }
}
