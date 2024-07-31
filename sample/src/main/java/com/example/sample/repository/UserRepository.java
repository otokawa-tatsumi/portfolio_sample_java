package com.example.sample.repository;

import com.example.sample.model.Users;
import java.util.List;

public interface UserRepository {
    Users findByUsername(String username);
    void save(Users user);
    List<Users> findAll();
}
