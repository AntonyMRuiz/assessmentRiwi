package com.assessment.riwi.api.abstract_controllers.generic;

import org.springframework.http.ResponseEntity;

public interface DeleteByIdController<ID> {
    ResponseEntity<Void> delete(ID id);
}
