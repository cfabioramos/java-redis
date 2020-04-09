package com.zaki.springredisexample.repository;

import com.zaki.springredisexample.model.User;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository{

    private final String STORE_NAME = "USER";
    private RedisTemplate<Integer, User> redisTemplate;
    private HashOperations hashOperations;

    public UserRepositoryImpl(RedisTemplate<Integer, User> redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.hashOperations = this.redisTemplate.opsForHash();
    }

    @Override
    public void save(User user) {
        hashOperations.put(STORE_NAME, user.id(), user);
    }

    @Override
    public Map<Integer, User> findAll() {
        return hashOperations.entries(STORE_NAME);
    }

    @Override
    public User findById(Integer id) {
        return (User)hashOperations.get(STORE_NAME, id);
    }

    @Override
    public void delete(User user) {
        this.hashOperations.delete(STORE_NAME, user);
    }

    @Override
    public void deleteOne(Integer id) {
        this.hashOperations.delete(STORE_NAME, id);
    }
}
