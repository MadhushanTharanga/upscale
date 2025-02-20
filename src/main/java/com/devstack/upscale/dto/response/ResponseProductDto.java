package com.devstack.upscale.dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ResponseProductDto {
    private String productId;
    private String description;
    private double uitPrice;
    private int qty;
}
