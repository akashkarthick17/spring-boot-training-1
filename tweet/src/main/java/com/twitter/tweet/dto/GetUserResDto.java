package com.twitter.tweet.dto;

import com.twitter.tweet.model.User;

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
