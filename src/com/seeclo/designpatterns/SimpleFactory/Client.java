package com.seeclo.designpatterns.SimpleFactory;

public class Client {

    public static void main(String[] agrs){
        Post post = PostFactory.createPost("blog");
        System.out.println(post);
    }
}
