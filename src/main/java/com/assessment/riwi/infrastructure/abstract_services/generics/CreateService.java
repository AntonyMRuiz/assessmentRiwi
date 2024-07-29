package com.assessment.riwi.infrastructure.abstract_services.generics;

public interface CreateService <requestDTO, responseDTO>{
    responseDTO create(requestDTO request);
}
