package com.twitter.tweet.dto;

public class CreateTweetReqDto {
    public String tweet;

    public CreateTweetReqDto() {
    }

    public CreateTweetReqDto(String tweet) {
        this.tweet = tweet;
    }
}
