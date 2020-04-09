package com.zaki.springredisexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@RedisHash("MOVIE")
public record Movie(@Id String id, @Indexed String title, User user) implements Serializable {
}
