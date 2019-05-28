package com.example.testapp.model;

import java.io.Serializable;

public class Dish implements Serializable {
    private String imageUrl;
    private String label;
    private double price;
    private String description;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Dish(String imageUrl, String label, double price, String description) {
        this.imageUrl = imageUrl;
        this.label = label;
        this.price = price;
        this.description = description;
    }
}
