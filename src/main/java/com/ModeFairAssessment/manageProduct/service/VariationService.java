package com.ModeFairAssessment.manageProduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ModeFairAssessment.manageProduct.model.Variation;
import com.ModeFairAssessment.manageProduct.repo.VariantRepo;

@Service
public class VariationService {
    private final VariantRepo variantRepo;

    @Autowired
    public VariationService(VariantRepo variantRepo){
        this.variantRepo = variantRepo;
    }

    public Variation addVariation(Variation variation){
        System.out.println("see: "+variation);
        return variantRepo.save(variation);
    }

    public List<Variation> getAllVariations(){
        return variantRepo.getAllVariations();
    }

    public Variation updateVariation(Variation variation){
        return variantRepo.save(variation);
    }

    public Variation findVariationById(int variation_id){
        return variantRepo.findVariationByVariationId(variation_id)
        .orElseThrow(()-> new VariationNotFoundException("Variation Id"+variation_id+" is not found!"));
    }

    public void deleteVariation(int variation_id){
        this.variantRepo.deleteVariationByVariationId(variation_id);
    }
}
