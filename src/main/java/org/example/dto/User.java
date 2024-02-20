package org.example.dto;

public class User {
    private long user_id;
    private String username;
    private int post_count;

    public long getUserId() {
        return user_id;
    }

    public String getUserName() {
        return username;
    }

    public int getPostCount() {
        return post_count;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPost_count(int post_count) {
        this.post_count = post_count;
    }
}
