package com.example.demo.Services;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService implements LoginServiceInterface{

   @Autowired
    private UserRepository userRepository;
    @Override
        public User findByNomAndPassword(String nom,String password) {

            return  userRepository.findByNomAndPassword(nom,password) ; }

            }



