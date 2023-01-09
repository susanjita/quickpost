package com.quickpost.quickpost.user;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class UserController {

    @GetMapping
    public User getPost(int userId)
    {
        return null;
    }
    @GetMapping
    public List<User> getAllUser()
    {
        return null;
    }
    
    @PostMapping
    public int createPost(String desc)
    {
        User user= new User();
        user.setId(1);
        user.setName(desc);
        return user.getId();
    }

    @DeleteMapping
    public String deleteUser(int id)
    {
        return "deleted";
    }
    
}
