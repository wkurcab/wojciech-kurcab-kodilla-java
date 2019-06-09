package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private String email;

    public User(final String name, final String surname, final String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}
