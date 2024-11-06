package com.example.SpringSecDemo.Dao;

import com.example.SpringSecDemo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
