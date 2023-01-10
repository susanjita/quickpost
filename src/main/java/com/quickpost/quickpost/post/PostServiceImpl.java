package com.quickpost.quickpost.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
@Component
public class PostServiceImpl implements PostService{
   
   static List<Post>  postDetails= new ArrayList<>();

   static{

    postDetails.add(new Post(1,"my first"));
    postDetails.add(new Post(2,"mysecond"));
    postDetails.add(new Post(3,"my third"));
   }

    @Override
    public void createPost(String postDescription) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see com.quickpost.quickpost.post.PostService#editPost(int)
     */
    @Override
    public void editPost(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Optional<Post> getPost(int id) {
        // TODO Auto-generated method stub
        return postDetails.stream().filter( post-> post.id==id ).findAny();
    }

    @Override
    public List<Post> getAllPost() {
        // TODO Auto-generated method stub
        return postDetails;
    }
    
}
