package com.osiel.ApiT.model;

public class Tennis {
    private Long id;
    private String name;
    private String description;
    private String mark;
    private String imageUrl;
    private String color;

    public Tennis(Long id, String name, String description, String mark, String imageUrl, String color) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mark = mark;
        this.imageUrl = imageUrl;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
