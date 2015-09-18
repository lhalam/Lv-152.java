package main.entities;

import java.lang.String;

public class User {

    private Base base;
    private String name;
    private String surname;
    private String role;
    private String email;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRole() {
        return role;
    }

    public Base getBase() {
        return base;
    }
}