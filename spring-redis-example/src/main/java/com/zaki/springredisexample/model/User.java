package com.zaki.springredisexample.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public record User (Integer id, String name, Double salary) implements Serializable {
}
