package com.codecool.MentorMe.api;

import com.codecool.MentorMe.model.User;
import com.codecool.MentorMe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {
    private UserService us;

    @Autowired
    public UserController(UserService us) {
        this.us = us;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return us.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) { return us.getUserById(id); }

    @PutMapping("/{id}")
    public void updateUserById(@PathVariable("id") Long id, @RequestBody User updatedUser) {
        us.updateUserById(id, updatedUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        us.deleteUserById(id);
    }


}
