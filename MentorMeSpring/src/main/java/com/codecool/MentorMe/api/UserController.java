package com.codecool.MentorMe.api;

import com.codecool.MentorMe.model.User;
import com.codecool.MentorMe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService us) {
        this.userService = us;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) { return userService.getUserById(id); }

    @PutMapping("/{id}")
    public void updateUserById(@PathVariable("id") Long id, @RequestBody User updatedUser) {
        userService.updateUserById(id, updatedUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user) { userService.addUser(user); }
}
