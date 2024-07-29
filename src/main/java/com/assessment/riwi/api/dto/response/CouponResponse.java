package com.assessment.riwi.api.dto.response;

import java.time.LocalDate;

import com.assessment.riwi.util.enums.StatusCoupon;

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
public class CouponResponse {
    private Long id;
    private StatusCoupon status;
    private LocalDate expirationDate;
    
}