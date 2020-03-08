package com.tutorial.security.controller;

import com.tutorial.security.model.User;
import com.tutorial.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/public")
@RequiredArgsConstructor
@CrossOrigin
public class PublicRestApiController {

    private final UserRepository userRepository;

    // Available to all authenticated users
    @GetMapping("test")
    public String test1(){
        return "API Test 1";
    }

    // Available to managers
    @GetMapping("management/reports")
    public String reports(){
        return "API Test 2";
    }

    // Available to ROLE_ADMIN
    @GetMapping("admin/users")
    public List<User> allUsers(){
        return this.userRepository.findAll();
    }
}