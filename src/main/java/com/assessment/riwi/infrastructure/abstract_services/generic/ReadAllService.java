package com.assessment.riwi.infrastructure.abstract_services.generic;


import org.springframework.data.domain.Page;

public interface ReadAllService <responseDTO> {
    Page<responseDTO> readAll(int page, int size);
}
