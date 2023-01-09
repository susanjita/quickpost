package com.quickpost.quickpost.post;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @GetMapping
    public Post getPost(int postId)
    {
        return null;
    }
    @GetMapping
    public Post getAllPost()
    {
        return null;
    }
    
    @PostMapping
    public int createPost(String desc)
    {
        Post post= new Post();
        post.setId(1);
        post.setPostDesc(desc);
        return post.getId();
    }

    @DeleteMapping
    public String deletePost(int id)
    {
        return "deleted";
    }
}
