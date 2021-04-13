package com.example.demo.service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    public Users getUserById(long id) {
        return userRepository.findById(id)
                .orElse(Users.builder().build());
    }
}
