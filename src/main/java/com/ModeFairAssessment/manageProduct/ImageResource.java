package com.ModeFairAssessment.manageProduct;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ModeFairAssessment.manageProduct.model.Image;
import com.ModeFairAssessment.manageProduct.service.ImageService;

@RestController
@RequestMapping("/image")
public class ImageResource {
    
    private final ImageService imageService;

    public ImageResource(ImageService imageService){
        this.imageService = imageService;
    }

    @PostMapping("/add")
    public ResponseEntity<Image> addImage(@RequestBody Image image){
        Image newImage = this.imageService.addImage(image);
        return new ResponseEntity<>(newImage, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Image>> getAllImages(){
        List<Image> images = this.imageService.getAllImages();
        return new ResponseEntity<>(images, HttpStatus.OK);
    }

}
