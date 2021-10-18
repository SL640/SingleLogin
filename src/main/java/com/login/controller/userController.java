package com.login.controller;


import com.login.domain.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class userController {

    @Autowired
    private com.login.repository.userRepository userRepository;

    @GetMapping(value = "/user/add")
    public user add(user user) {
        return userRepository.insert(user);
    }

    @GetMapping(value = "/user/findAll")
    public List<user> findAll() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/user/findById")
    public Optional<user> findById(String userId) {
        return userRepository.findById(userId);
    }

    @GetMapping(value = "/user/update")
    public user update(user user) {
        if (userRepository.existsById(user.getUserId())) return userRepository.save(user);
        else return null;
    }

    @GetMapping(value = "/user/delete")
    public boolean delete(String userId) {
        userRepository.deleteById(userId);
        return !userRepository.existsById(userId);
    }
}
