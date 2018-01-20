package com.marketprice.marketpriceapp.domain;

/**
 * Created by User on 19/01/2018.
 */

public class Account {

    private Long id_acc;
    private String username;
    private String password;
    private String email;
    private String role;
    private String token;

    public Long getId_acc() {
        return id_acc;
    }

    public void setId_acc(Long id_acc) {
        this.id_acc = id_acc;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id_acc=" + id_acc +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
