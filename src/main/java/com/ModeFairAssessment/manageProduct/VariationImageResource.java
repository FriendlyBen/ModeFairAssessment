package com.ModeFairAssessment.manageProduct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ModeFairAssessment.manageProduct.model.VariantImage;
import com.ModeFairAssessment.manageProduct.service.VariantImageService;

@RestController
@RequestMapping("/VariantImage")
public class VariationImageResource {
    
    private final VariantImageService vis;

    public VariationImageResource(VariantImageService vis){
        this.vis = vis;
    }

    @PostMapping("/add")
    public ResponseEntity<VariantImage> addNewVariantImage(@RequestBody VariantImage vi){
        VariantImage newVariantImage = this.vis.addVariantImage(vi);
        return new ResponseEntity<>(newVariantImage, HttpStatus.OK);
    }

}
