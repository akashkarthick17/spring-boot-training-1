package com.twitter.user.model;

public class User {
    public int id;
    public String name;
    public int age;
    public String gender;

    public User() {
    }

    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
