package com.assessment.riwi.infrastructure.abstract_services.generics;

public interface DeleteByIdService<ID> {
    void deleteById(ID id);
}
