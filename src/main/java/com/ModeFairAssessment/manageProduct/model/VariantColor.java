package com.ModeFairAssessment.manageProduct.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class VariantColor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int VariantColorId;

    private int variationId;
    
    public int getVariationId() {
        return variationId;
    }


    public void setVariationId(int variationId) {
        this.variationId = variationId;
    }

    private int colorId;

    public VariantColor(){}


    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }




}
