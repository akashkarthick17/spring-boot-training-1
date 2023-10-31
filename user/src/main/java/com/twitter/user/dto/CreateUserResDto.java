package com.twitter.user.dto;

public class CreateUserResDto {
    public boolean isSuccess;
    public String message;

    public CreateUserResDto() {
    }

    public CreateUserResDto(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }
}
