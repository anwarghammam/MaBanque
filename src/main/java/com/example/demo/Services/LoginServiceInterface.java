package com.example.demo.Services;

import com.example.demo.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface LoginServiceInterface {
    User findByNomAndPassword(String name , String password);
}
