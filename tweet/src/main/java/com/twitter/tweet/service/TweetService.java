package com.twitter.tweet.service;

import com.twitter.tweet.dto.CreateTweetReqDto;
import com.twitter.tweet.dto.GetUserResDto;
import com.twitter.tweet.http.UserHttp;
import com.twitter.tweet.model.Tweet;
import com.twitter.tweet.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {
    @Autowired
    public TweetRepository tweetRepository;
    @Autowired
    public UserHttp userHttp;

    public void createTweet(CreateTweetReqDto createTweetReqDto, int userId) {
        GetUserResDto getUserResDto = this.userHttp.getUser(userId);
        if(getUserResDto.isSuccess == true) {
            Tweet tweet = new Tweet(userId, createTweetReqDto.tweet);
            this.tweetRepository.save(tweet);
        }
    }

    public List<String> getTweets(int userId) {
        GetUserResDto getUserResDto = this.userHttp.getUser(userId);
        if(getUserResDto.isSuccess == true) {
            List<Tweet> tweets = this.tweetRepository.getTweetsOfUser(userId);
            return tweets.stream().map(tweet -> tweet.tweet).toList();
        } else {
            return null;
        }
    }
}
