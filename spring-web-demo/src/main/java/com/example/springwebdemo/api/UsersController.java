package com.example.springwebdemo.api;

import com.example.springwebdemo.business.UserService;
import com.example.springwebdemo.dataAccess.UserDao;
import com.example.springwebdemo.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UsersController {
    private UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("")
    public String getAll(){
        return "dsdf";
    }

    @RequestMapping("getAll/")
    public List<User> getA(){
        return userService.getAll();
    }
}
