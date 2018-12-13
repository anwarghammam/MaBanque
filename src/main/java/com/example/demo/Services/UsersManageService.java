package com.example.demo.Services;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsersManageService implements UsersManageInterface{
    @Autowired
    private UserRepository userRepository;
    @Override
    public ArrayList<User> findAll() {
        return userRepository.findAll() ;

    }
    @Override
  public  void deleteUserById(String id){
         userRepository.deleteUserById(id);
    }


@Override
 public  ArrayList<User> findByNom(String nom){
      return  userRepository.findByNom(nom);
}
@Override
    public User findById (String id) {
        return( userRepository.findById(id));

}

}
