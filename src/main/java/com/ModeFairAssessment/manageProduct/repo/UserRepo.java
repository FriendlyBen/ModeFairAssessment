package com.ModeFairAssessment.manageProduct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ModeFairAssessment.manageProduct.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
