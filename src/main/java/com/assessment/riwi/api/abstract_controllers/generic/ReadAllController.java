package com.assessment.riwi.api.abstract_controllers.generic;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

public interface ReadAllController<responseDTO> {
    ResponseEntity<Page<responseDTO>> readAll(int page, int size);
}
