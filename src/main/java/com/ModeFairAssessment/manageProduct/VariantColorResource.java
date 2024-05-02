package com.ModeFairAssessment.manageProduct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ModeFairAssessment.manageProduct.model.VariantColor;
import com.ModeFairAssessment.manageProduct.service.VariantColorService;

@RestController
@RequestMapping("/VariantColor")
public class VariantColorResource {
    private final VariantColorService vcs;

    public VariantColorResource(VariantColorService vcs){
        this.vcs = vcs;
    }

    @PostMapping("/add")
    public ResponseEntity<VariantColor> addNewVariantColor(@RequestBody VariantColor variantcolor){
        VariantColor newVariantColor = this.vcs.addVCR(variantcolor);
        return new ResponseEntity<>(newVariantColor, HttpStatus.OK);
    }
}
