package com.example.springwebdemo.dataAccess;

import com.example.springwebdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
