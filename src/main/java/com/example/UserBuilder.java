package com.example;

import java.time.LocalDate;

public final class UserBuilder {

    private Integer id;

    private String name;

    private String username;

    private String password;

    private String email;

    private LocalDate createdAt;

    public static UserBuilder anUser () {
        return new UserBuilder();
    }

    public UserBuilder id (Integer id) {
        this.id = id;
        return this;
    }

    public UserBuilder name (String name) {
        this.name = name;
        return this;
    }

    public UserBuilder username (String username) {
        this.username = username;
        return this;
    }

    public UserBuilder password (String password) {
        this.password = password;
        return this;
    }

    public UserBuilder email (String email) {
        this.email = email;
        return this;
    }

    public UserBuilder createdAt (LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public User build () {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setCreatedAt(createdAt);
        return user;
    }
}
