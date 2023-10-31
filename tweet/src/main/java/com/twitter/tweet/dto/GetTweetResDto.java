package com.twitter.tweet.dto;

import com.twitter.tweet.model.Tweet;

import java.util.List;

public class GetTweetResDto {
    public boolean isSuccess;
    public String message;
    public int userId;
    public List<String> tweets;

    public GetTweetResDto() {
    }

    public GetTweetResDto(boolean isSuccess, String message, int userId, List<String> tweets) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.userId = userId;
        this.tweets = tweets;
    }
}
