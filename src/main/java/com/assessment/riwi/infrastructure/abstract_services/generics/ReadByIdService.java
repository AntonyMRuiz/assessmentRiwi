package com.assessment.riwi.infrastructure.abstract_services.generics;

public interface ReadByIdService<responseDTO, ID> {
    responseDTO readById(ID id);
}
