package com.ModeFairAssessment.manageProduct;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ModeFairAssessment.manageProduct.model.Variation;
import com.ModeFairAssessment.manageProduct.service.VariationService;

@RestController
@RequestMapping("/variation")
public class VariationResource {
    private final VariationService variationService;

    public VariationResource(VariationService vs){
        this.variationService = vs;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Variation>> getAllVariation(){
        List<Variation> variations = this.variationService.getAllVariations();
        return new ResponseEntity<>(variations, HttpStatus.OK);
    }

    @GetMapping("/find/{variation_id}")
    public ResponseEntity<Variation> getVariationById(@PathVariable("variation_id") int variation_id){
        Variation variation = this.variationService.findVariationById(variation_id);
        return new ResponseEntity<>(variation, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Variation> addVariation(@RequestBody Variation variation){
        Variation newVariation = this.variationService.addVariation(variation);
        return new ResponseEntity<>(newVariation, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Variation> updateVariation(@RequestBody Variation variation){
        Variation updatedVariation = this.variationService.updateVariation(variation);
        return new ResponseEntity<>(updatedVariation, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{variation_id}")
    public ResponseEntity<?> deleteVariation(@PathVariable("variation_id") int variation_id){
        this.variationService.deleteVariation(variation_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
