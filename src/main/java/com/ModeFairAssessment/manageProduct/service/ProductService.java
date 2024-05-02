package com.ModeFairAssessment.manageProduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ModeFairAssessment.manageProduct.model.Product;
import com.ModeFairAssessment.manageProduct.repo.ProductRepo;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product addProduct(Product product){
        // product.setProductId(1);
        return productRepo.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Product updateProduct(Product product){
        return productRepo.save(product);
    }

    public Product findProductByProductId(int ProductId){
        return productRepo.findProductByProductId(ProductId)
        .orElseThrow(()-> new NotFoundException("Product by id: "+ProductId+" was not found"));
    }

    public void deleteProduct(int ProductId){ // maybe need a function to delete variation
        productRepo.deleteProductByProductId(ProductId);
    }
}
