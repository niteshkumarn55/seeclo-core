package com.seeclo.designpatterns.SimpleFactory;


public class NewPost extends Post {

    private String newPostName;

    public String getNewPostName() {
        return newPostName;
    }

    public void setNewPostName(String newPostName) {
        this.newPostName = newPostName;
    }

    @Override
    public String toString() {
        return "NewPost{" +
                "newPostName='" + newPostName + '\'' +
                '}';
    }
}
