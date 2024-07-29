package com.assessment.riwi.api.abstract_controllers.generic;

import org.springframework.http.ResponseEntity;

public interface CreateController<responseDTO, requestDTO>{
    ResponseEntity<responseDTO> create(requestDTO request);
}
