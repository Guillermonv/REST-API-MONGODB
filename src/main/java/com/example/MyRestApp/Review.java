package com.example.MyRestApp;

public class Review {
    String username;
    int score;
    boolean approve;

    public Review(String username, int score, boolean approve) {
        this.username = username;
        this.score = score;
        this.approve = approve;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isApprove() {
        return approve;
    }

    public void setApprove(boolean approve) {
        this.approve = approve;
    }
}
