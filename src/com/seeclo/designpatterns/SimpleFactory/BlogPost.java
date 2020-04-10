package com.seeclo.designpatterns.SimpleFactory;

public class BlogPost extends Post {
    private String blogName = "New Blog";

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "blogName='" + blogName + '\'' +
                '}';
    }
}
