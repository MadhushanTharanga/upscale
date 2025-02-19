package com.devstack.upscale.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity(name = "product")
public class Product {
    @Id
    @Column(name = "product_id",nullable = false, length = 80)
    private String productId;
    @Column(name = "description",nullable = false, length = 255)
    private String description;
    @Column(name = "unit_price", nullable = false,length = 20)
    private double unitPrice;
    @Column(name = "qty",nullable = false,length = 10)
    private int qty;
}
