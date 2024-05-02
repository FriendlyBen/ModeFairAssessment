package com.ModeFairAssessment.manageProduct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ModeFairAssessment.manageProduct.model.User;
import com.ModeFairAssessment.manageProduct.service.UserService;

@RestController
@RequestMapping("/user")
public class UserResource {
    private UserService userService;

    public UserResource(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newUser = this.userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
}
