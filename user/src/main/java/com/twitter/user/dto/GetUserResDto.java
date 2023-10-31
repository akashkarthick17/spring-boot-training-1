package com.twitter.user.dto;

import com.twitter.user.model.User;

import java.util.List;

public class GetUserResDto {
    public boolean isSuccess;
    public String message;
    public User user;

    public GetUserResDto() {
    }

    public GetUserResDto(boolean isSuccess, String message, User user) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.user = user;
    }
}
