package com.assessment.riwi.api.dto.request;

import java.time.LocalDate;

import com.assessment.riwi.util.enums.StatusCoupon;

import jakarta.validation.constraints.Future;
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
public class CouponRequest {
    @NotNull(message = "Status is mandatory")
    private StatusCoupon status;
    
    @NotNull(message = "Expiration date is mandatory")
    @Future(message = "Expiration date must be in the future")
    private LocalDate expirationDate;

    
}