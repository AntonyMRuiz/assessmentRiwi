package com.assessment.riwi.api.dtos.requests;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
public class OrderRequest {
    @NotNull(message = "userId is mandatory")
    private Long userId;

    @NotNull(message = "productId is mandatory")
    private Long productId;

    @NotNull(message = "couponId is mandatory")
    private Long couponId;

    @NotNull(message = "totalPrice is mandatory")
    @DecimalMin(value = "0.0", inclusive = false, message = "totalPrice must be greater than 0")
    private Double totalPrice;

    @NotNull(message = "Quantity is mandatory")
    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantityProducts; 


    
}
