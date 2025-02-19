package com.devstack.upscale.dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ResponseCustomerDto {
    private String propertyId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private boolean isActive;
}
