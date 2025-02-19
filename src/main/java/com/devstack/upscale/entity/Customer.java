package com.devstack.upscale.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @Column(name = "property_id", nullable = false,length = 80)
    private String propertyId;
    @Column(name = "name",nullable = false,length = 45)
    private String name;
    @Column(name = "email",unique = true,nullable = false,length = 100)
    private String email;
    @Column(name = "phone",length = 20,nullable = false)
    private String phone;
    @Column(name = "address",length = 255,nullable = false)
    private String address;
    @Column(name = "isActive", columnDefinition = "TINYINT")
    private boolean isActive;

    public Customer() {
    }

    public Customer(String propertyId, String name, String email, String phone, String address, boolean isActive) {
        this.propertyId = propertyId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.isActive = isActive;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
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
        return "Customer{" +
                "propertyId='" + propertyId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
