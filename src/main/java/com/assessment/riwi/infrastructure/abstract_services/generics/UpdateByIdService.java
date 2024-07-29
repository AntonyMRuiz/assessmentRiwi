package com.assessment.riwi.infrastructure.abstract_services.generics;

public interface UpdateByIdService<requestDTO, responseDTO, ID> {
    responseDTO updateById(ID id, requestDTO request);
}
