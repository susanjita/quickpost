package com.quickpost.quickpost.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
@Component
public class PostServiceImpl implements PostService{
   
   static List<Post>  postDetails= new ArrayList<>();
   static int i=0;
   static{

    postDetails.add(new Post(nextId(),"my first"));
    postDetails.add(new Post(nextId(),"mysecond"));
    postDetails.add(new Post(nextId(),"my third"));
   }
   public static int nextId()
   {
    i=i+1;
    return i;
   }
    @Override
    public void createPost(String postDescription) {
        // TODO Auto-generated method stub
        Post post= new Post(nextId(), postDescription);
        postDetails.add(post);
        
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
    @Override
    public boolean deletePost(int id) {
       return  postDetails.removeIf(post-> post.id==id);
        
    }
    
}
