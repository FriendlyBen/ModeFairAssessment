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

import com.ModeFairAssessment.manageProduct.model.Product;
import com.ModeFairAssessment.manageProduct.service.ProductService;

@RestController
@RequestMapping("/product") //this is related to @GetMapping
public class ProductResource { //this is like a controller
    private final ProductService productService;

    public ProductResource(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    } 

    @GetMapping("/find/{ProductId}")
    public ResponseEntity<Product> getProductById (@PathVariable("ProductId") int ProductId){
        Product product = productService.findProductByProductId(ProductId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/add") //create (post)
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product newProduct = productService.addProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

    @PutMapping("/update") // update (put)
    public ResponseEntity<Product> updatedProduct(@RequestBody Product product){
        Product updateProduct = productService.updateProduct(product);
        return new ResponseEntity<>(updateProduct, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{ProductId}") //delete ResponseEntity<?> means it does not return anything
    public ResponseEntity<?> deleteProduct(@PathVariable("ProductId") int ProductId){
        productService.deleteProduct(ProductId);
        return new ResponseEntity<>(HttpStatus.OK);
    } 

    
}
