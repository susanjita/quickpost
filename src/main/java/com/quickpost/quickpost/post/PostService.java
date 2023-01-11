package com.quickpost.quickpost.post;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;


public interface PostService {

    public void createPost(String postDescription);

    public void editPost(int id);

    public Optional<Post> getPost(int id);

    public List<Post> getAllPost();

    public boolean deletePost(int id);
   
    
}
