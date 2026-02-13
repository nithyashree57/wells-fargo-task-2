package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double totalValue;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    protected Portfolio() {
    }

    public Portfolio(String name, double totalValue, Client client) {
        this.name = name;
        this.totalValue = totalValue;
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public Client getClient() {
        return client;
    }
}

