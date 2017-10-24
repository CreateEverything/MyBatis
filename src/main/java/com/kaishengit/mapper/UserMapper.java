package com.kaishengit.mapper;

import com.kaishengit.entity.User;

import java.util.List;

public interface UserMapper {
    void save(User user);
    User findById(int id);
    void deleteById(int id);
    List<User> findAll();
}
