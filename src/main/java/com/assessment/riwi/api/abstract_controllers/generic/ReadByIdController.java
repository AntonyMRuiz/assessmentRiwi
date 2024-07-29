package com.assessment.riwi.api.abstract_controllers.generic;

import org.springframework.http.ResponseEntity;

public interface ReadByIdController<responseDTO, ID> {
    ResponseEntity<responseDTO> read(ID id);
}
