package com.assessment.riwi.api.dto.errors;

import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListResponseErrors implements Serializable {
    private String status;
    private Integer code;
    private List<Map<String,String>> errors;
}
