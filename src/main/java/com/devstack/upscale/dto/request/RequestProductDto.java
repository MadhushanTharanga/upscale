package com.devstack.upscale.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RequestProductDto {
    private String description;
    private double unitPrice;
    private int qty;
}
