package com.twitter.user.dto;

public class CreateUserReqDto {
    public String name;
    public int age;
    public String gender;

    public CreateUserReqDto() {
    }

    public CreateUserReqDto(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
