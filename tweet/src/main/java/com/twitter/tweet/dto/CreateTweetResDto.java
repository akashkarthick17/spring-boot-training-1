package com.twitter.tweet.dto;

public class CreateTweetResDto {
    public boolean isSuccess;
    public String message;

    public CreateTweetResDto() {
    }

    public CreateTweetResDto(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }
}
