package com.assessment.riwi.infrastructure.abstract_services.generics;

public interface ReadByDiscountService<responseDTO,ID> {
    responseDTO readByDiscount(ID id);
}
