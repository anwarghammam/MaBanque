package com.example.demo.Repository;

import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
public interface UserRepository  extends CrudRepository<User,Integer> {
    User findByNomAndPassword(String nom ,String password);
    User findById(String id);
    ArrayList<User> findAll();
    @Modifying
    @Transactional
    void deleteUserById(String id);
    ArrayList<User> findByNom(String nom);
}
