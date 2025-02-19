package com.devstack.upscale.dto.request;

import lombok.*;


@Builder
public class RequestCustomerDto {
    private String name;
    private String email;
    private String phone;
    private String address;
    private boolean isActive;

    public RequestCustomerDto() {
    }

    public RequestCustomerDto(String name, String email, String phone, String address, boolean isActive) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "RequestCustomerDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
