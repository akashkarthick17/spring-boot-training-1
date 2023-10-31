package com.twitter.tweet.model;

public class Tweet {
    public int userId;
    public String tweet;

    public Tweet() {
    }

    public Tweet(int userId, String tweet) {
        this.userId = userId;
        this.tweet = tweet;
    }
}
