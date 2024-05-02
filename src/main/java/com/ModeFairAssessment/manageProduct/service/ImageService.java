package com.ModeFairAssessment.manageProduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ModeFairAssessment.manageProduct.model.Image;
import com.ModeFairAssessment.manageProduct.repo.ImageRepo;

@Service
public class ImageService {

    private final ImageRepo imageRepo;
    
    @Autowired
    public ImageService(ImageRepo imageRepo){
        this.imageRepo = imageRepo;
    }

    public Image addImage(Image image){
        return this.imageRepo.save(image);
    }

    public List<Image> getAllImages(){
        return imageRepo.findAll();
    }
}
