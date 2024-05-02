package com.ModeFairAssessment.manageProduct;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ModeFairAssessment.manageProduct.model.Color;
import com.ModeFairAssessment.manageProduct.service.ColorService;

@RestController
@RequestMapping("/color")
public class ColorResource{
    private final ColorService colorService;

    public ColorResource(ColorService colorService){
        this.colorService = colorService;
    }

    @PostMapping("/add")
    public ResponseEntity<Color> addColor(@RequestBody Color color){
        Color newColor = this.colorService.AddColor(color);
        return new ResponseEntity<>(newColor, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Color>> getAllColors(){
        List<Color> colors = this.colorService.getAllColor();
        return new ResponseEntity<>(colors, HttpStatus.OK);
    }


}