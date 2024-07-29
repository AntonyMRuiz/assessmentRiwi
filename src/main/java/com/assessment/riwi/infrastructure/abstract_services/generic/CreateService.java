package com.assessment.riwi.infrastructure.abstract_services.generic;

public interface CreateService <requestDTO, responseDTO>{
    responseDTO create(requestDTO request);
}
