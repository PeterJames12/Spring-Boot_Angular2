package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Igor Hnes on 2/1/18.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/all")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/findById")
    public User findById(@RequestParam Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long userId) {
        userService.delete(userId);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
}
