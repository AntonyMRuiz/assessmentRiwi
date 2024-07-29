package com.assessment.riwi.api.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class OrderResponse {
    private Long id;
    private Long userId;
    private Long productId;
    private Long couponId;
    private Double totalPrice;
    private int quantityProducts; 
}
    
