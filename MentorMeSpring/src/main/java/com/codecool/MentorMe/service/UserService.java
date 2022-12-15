package com.codecool.MentorMe.service;

import com.codecool.MentorMe.model.User;
import com.codecool.MentorMe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository ur) {
        this.userRepository = ur;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() { return userRepository.findAll(); }

    private boolean checkIfUserExists(Long id) {
        return userRepository.existsById(id);
    }


}
