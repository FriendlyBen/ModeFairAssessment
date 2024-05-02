package com.ModeFairAssessment.manageProduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ModeFairAssessment.manageProduct.model.VariantImage;
import com.ModeFairAssessment.manageProduct.repo.VariantImageRepo;


@Service
public class VariantImageService {

    private final VariantImageRepo vir;

    @Autowired
    public VariantImageService(VariantImageRepo vir){
        this.vir = vir;
    }

    public VariantImage addVariantImage(VariantImage vi){
        return this.vir.save(vi);
    }
}
