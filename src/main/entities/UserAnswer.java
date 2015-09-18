package main.entities;

import java.lang.String;

public class UserAnswer {

    private Base base;
    private User user;
    private Question question;
    private String content;

    public Base getBase() {
        return base;
    }

    public User getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public Question getQuestion() {
        return question;
    }
}