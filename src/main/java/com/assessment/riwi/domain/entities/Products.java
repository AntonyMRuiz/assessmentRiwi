package com.assessment.riwi.domain.entities;

import com.assessment.riwi.util.enums.Category;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "product")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(nullable = false)
    private double price;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "products",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private List<Order> orderList;
}
