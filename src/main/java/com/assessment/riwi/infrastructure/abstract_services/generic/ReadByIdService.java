package com.assessment.riwi.infrastructure.abstract_services.generic;

public interface ReadByIdService<responseDTO, ID> {
    responseDTO readById(ID id);
}
