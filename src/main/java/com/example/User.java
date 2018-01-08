package com.example;

import java.time.LocalDate;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

public class User {

    private Integer id;

    @JsonbTransient
    private String name;

    private String username;

    @JsonbProperty("passwd")
    private String password;

    private String email;

    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDate createdAt;

    public Integer getId () {
        return id;
    }

    public void setId (final Integer id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (final String name) {
        this.name = name;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (final String username) {
        this.username = username;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (final String password) {
        this.password = password;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (final String email) {
        this.email = email;
    }

    public LocalDate getCreatedAt () {
        return createdAt;
    }

    public void setCreatedAt (final LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    @Override
    public String toString () {
        final StringBuilder builder = new StringBuilder()
                .append("User [")
                .append("id=")
                .append(id)
                .append(",name=\"")
                .append(name).append("\"")
                .append(",username=\"")
                .append(username).append("\"")
                .append(",password=\"")
                .append(password).append("\"")
                .append(",email=\"")
                .append(email).append("\"")
                .append(",createdAt=")
                .append(createdAt)
                .append("]");
        return builder.toString();
    }
}
