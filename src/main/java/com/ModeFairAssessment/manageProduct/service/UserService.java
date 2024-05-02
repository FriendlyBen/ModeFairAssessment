package com.ModeFairAssessment.manageProduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ModeFairAssessment.manageProduct.model.User;
import com.ModeFairAssessment.manageProduct.repo.UserRepo;

@Service
public class UserService {

    private final UserRepo userRepo;
    
    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public User addUser(User user){
        return this.userRepo.save(user);
    }
}
