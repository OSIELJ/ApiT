package com.osiel.ApiT.dto;

public class TennisDto {
    private Long id;
    private String name;
    private String brand;
    private String imageUrl;

    public TennisDto(Long id, String name, String brand, String imageUrl) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
