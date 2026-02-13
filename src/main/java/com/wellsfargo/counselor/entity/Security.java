package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private double price;

    protected Security() {
    }

    public Security(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
