package com.ModeFairAssessment.manageProduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ModeFairAssessment.manageProduct.model.VariantColor;
import com.ModeFairAssessment.manageProduct.repo.VariantColorRepo;

@Service
public class VariantColorService {

    private final VariantColorRepo vcr;

    @Autowired
    public VariantColorService(VariantColorRepo vcr){
        this.vcr = vcr;
    }

    public VariantColor addVCR(VariantColor variantcolor){
        return this.vcr.save(variantcolor);
    }
}
