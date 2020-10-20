package com.example.gradlemongotest.controller;


import com.example.gradlemongotest.entity.User;
import com.example.gradlemongotest.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@AllArgsConstructor
@RestController
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/all")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping("/insert")
    public void insert(String name,String salary){
        User user = new User(name, salary);
        userRepository.save(user);
    }
}
