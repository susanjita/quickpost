package com.quickpost.quickpost.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {

    

    int id;
    String postDesc;
    public Post(int id, String postDesc) {
        this.id = id;
        this.postDesc = postDesc;
    }
    
}
