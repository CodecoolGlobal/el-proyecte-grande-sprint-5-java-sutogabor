package com.codecool.MentorMe.service;

import com.codecool.MentorMe.model.User;
import com.codecool.MentorMe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
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

    public User getUserById(Long id) {
        if(!checkIfUserExists(id)) {
            throw new EntityNotFoundException("User not found at ID: " + id);
        }
        return userRepository.getById(id);
    }

    public void updateUserById(Long id, User updatedUser) {
        if(!checkIfUserExists(id)) {
            throw new EntityNotFoundException("User not found at ID: " + updatedUser.getId());
        }
        updatedUser.setId(id);
        userRepository.save(updatedUser);
    }

    public void deleteUserById(Long id){
        if(!checkIfUserExists(id)) {
            throw new EntityNotFoundException("User not found at ID: " + id);
        }
        userRepository.deleteById(id);
    }
}
