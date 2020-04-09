package com.zaki.springredisexample.repository;

import com.zaki.springredisexample.model.User;

import java.util.List;
import java.util.Map;

public interface UserRepository {

    void save(User user);
    Map<Integer, User> findAll();
    User findById(Integer id);
    void delete(User user);
    void deleteOne(Integer id);

}
