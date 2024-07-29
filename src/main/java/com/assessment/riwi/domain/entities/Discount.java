package com.assessment.riwi.domain.entities;

import com.assessment.riwi.util.enums.StatusCoupon;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "discount")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double discount;

    @Column(nullable = false)
    private LocalDate expirationDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusCoupon status;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;
}
