package com.ModeFairAssessment.manageProduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ModeFairAssessment.manageProduct.model.Color;
import com.ModeFairAssessment.manageProduct.repo.ColorRepo;

@Service
public class ColorService {
    private final ColorRepo colorRepo;

    @Autowired
    public ColorService(ColorRepo colorRepo){
        this.colorRepo = colorRepo;
    }

    public Color AddColor(Color color){
       return this.colorRepo.save(color);
    }

    public List<Color> getAllColor(){
        return this.colorRepo.findAll();
    }
}
