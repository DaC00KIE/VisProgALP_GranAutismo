package com.example.visprogalp_granautismo.model;

public class Login {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }
}