package com.example.gradlemongotest.controller;


import com.example.gradlemongotest.entity.User;
import com.example.gradlemongotest.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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
    public void insert(User user){
        userRepository.save(user);
    }

    @PostMapping("/update")
    public void insert(String oldName, String newName){
        User user = userRepository.findByName(oldName).get();
        user.setName(newName);
        userRepository.save(user);
    }
}
