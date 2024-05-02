package com.ModeFairAssessment.manageProduct.repo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ModeFairAssessment.manageProduct.model.*;

public interface ProductRepo extends JpaRepository<Product, Integer>{

    void deleteProductByProductId(int productId);

    Optional<Product> findProductByProductId(int productId);

}
