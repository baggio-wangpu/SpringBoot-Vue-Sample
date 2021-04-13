package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return service.getAllUsers();
    }

//    @PostMapping
//    public void postUsers(@RequestBody UserDto dto) {
//        service.add(dto);
//    }
//
    @GetMapping("/{id}")
    public Users getById(@PathVariable long id) {
        return service.getUserById(id);
    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable(required = true) long id) {
//        service.delete(id);
//    }
}
