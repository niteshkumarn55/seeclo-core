package com.seeclo.designpatterns.SimpleFactory;

public class PostFactory {

    public static Post createPost(String type){
        switch (type){
            case "blog":
                return new BlogPost();
            case "news":
                return new NewPost();
            default:
                throw  new IllegalArgumentException("Post type unknown");
        }
    }
}
