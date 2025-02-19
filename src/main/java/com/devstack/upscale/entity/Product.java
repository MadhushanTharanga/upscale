package com.devstack.upscale.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity(name = "product")
public class Product {
    @Id
    @Column(name = "product id",nullable = false,unique = true)
    private String productId;
    @Column(name = "description",nullable = false, length = 255)
    private String description;
    @Column(name = "unit price", nullable = false,length = 20)
    private double uitPrice;
    @Column(name = "qty",nullable = false,length = 10)
    private int qtyOnHand;
}
