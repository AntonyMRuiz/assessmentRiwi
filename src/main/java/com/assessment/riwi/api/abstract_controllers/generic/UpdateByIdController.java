package com.assessment.riwi.api.abstract_controllers.generic;

import org.springframework.http.ResponseEntity;

public interface UpdateByIdController<responseDTO, requestDTO, ID> {
    ResponseEntity<responseDTO> update(requestDTO request, ID id);
}
