package com.twitter.tweet.repository;

import com.twitter.tweet.model.Tweet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TweetRepository {
    List<Tweet> tweetList = new ArrayList<>();

    public void save(Tweet tweet) {
        tweetList.add(tweet);
    }

    public List<Tweet> getTweetsOfUser(int userId) {
        return tweetList.stream().filter(tweet -> tweet.userId == userId).toList();
    }
}
