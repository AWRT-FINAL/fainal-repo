package com.example.projectsoftware;



public class FeedbackEntry {

    public int userId;
    private final String feedback;

    public FeedbackEntry(int userId, String feedback) {
        this.userId = userId;
        this.feedback = feedback;
    }



    public String getFeedback() {
        return feedback;
    }
    public void setuserId(int userId) {
        this.userId = userId;
    }
    public int getUserId() {
        return userId;
    }
}