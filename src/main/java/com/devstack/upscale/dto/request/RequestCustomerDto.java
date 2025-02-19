package com.devstack.upscale.dto.request;

import lombok.*;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestCustomerDto {
    private String name;
    private String email;
    private String phone;
    private String address;
    private boolean isActive;

}
