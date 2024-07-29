package com.assessment.riwi.infrastructure.abstract_services.generic;

public interface DeleteByIdService<ID> {
    void deleteById(ID id);
}
