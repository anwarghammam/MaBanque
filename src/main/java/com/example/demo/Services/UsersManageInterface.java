package com.example.demo.Services;

import com.example.demo.Model.User;

import java.util.ArrayList;

public interface UsersManageInterface {
    ArrayList<User> findAll();

    void deleteUserById(String id);
    ArrayList<User> findByNom(String nom);
    User findById(String id);
}
