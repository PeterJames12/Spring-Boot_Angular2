package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 2/1/18.
 */
public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User create(User user);

    void delete(Long userId);

    User update(User user);
}
