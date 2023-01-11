package com.quickpost.quickpost.post;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
   @Autowired
    PostService postService;

    @GetMapping("/user/{postId}")
    public Optional<Post> getPost(@PathVariable int postId)
    {
        return postService.getPost(postId);
    }
    @GetMapping("/users")
    public List<Post> getAllPost()
    {
        return postService.getAllPost();
    }
    
    @PostMapping("/createUser")
    public int createPost(@RequestBody Post post)
    {
        postService.createPost(post.postDesc);
        return 0;
    }
    @DeleteMapping("/deleteUser/{id}")
    public boolean deletePost(@PathVariable int id)
    {
                return postService.deletePost(id);
    }
}
