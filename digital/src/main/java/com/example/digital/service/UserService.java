package com.example.digital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.digital.model.User;
import com.example.digital.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public boolean updateUserDetails(int userId, User user) {
        if (userRepository.findById(userId) == null) {
            return false;
        }
        try {
            userRepository.save(user);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean deleteUser(int userId) {
        if (getUserById(userId) == null) {
            return false;
        }
        userRepository.deleteById(userId);
        return true;
    }

    public User getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
