package com.ModeFairAssessment.manageProduct.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int colorId;
    private String colorName;
    private String colorImageUrl;

    public Color(){}

    public String getColorImageUrl() {
        return colorImageUrl;
    }

    public void setColorImageUrl(String colorImageUrl) {
        this.colorImageUrl = colorImageUrl;
    }

    
    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getColorId() {
        return colorId;
    }


    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }


    
}
