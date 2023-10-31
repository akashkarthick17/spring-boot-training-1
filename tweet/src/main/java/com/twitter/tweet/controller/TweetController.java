package com.twitter.tweet.controller;

import com.twitter.tweet.dto.CreateTweetReqDto;
import com.twitter.tweet.dto.CreateTweetResDto;
import com.twitter.tweet.dto.GetTweetResDto;
import com.twitter.tweet.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tweets")
public class TweetController {
    @Autowired
    public TweetService tweetService;

    @PostMapping("/users/{userId}")
    public CreateTweetResDto createTweet(@RequestBody CreateTweetReqDto createTweetReqDto, @PathVariable int userId) {
        System.out.println(userId);
        System.out.println(createTweetReqDto.tweet);
        this.tweetService.createTweet(createTweetReqDto, userId);

        CreateTweetResDto createTweetResDto = new CreateTweetResDto();
        createTweetResDto.isSuccess = true;
        createTweetResDto.message = "Tweet created Successfully";

        return createTweetResDto;
    }

    @GetMapping("/users/{userId}")
    public GetTweetResDto getTweets(@PathVariable int userId) {
        GetTweetResDto getTweetResDto = new GetTweetResDto();
        List<String> tweets = this.tweetService.getTweets(userId);
        if(tweets == null) {
            getTweetResDto.isSuccess = false;
            getTweetResDto.message = "Invalid user!";
        }  else {
            getTweetResDto.isSuccess = true;
            getTweetResDto.message = "Tweets fetched successfully!";
            getTweetResDto.userId = userId;
            getTweetResDto.tweets = tweets;
        }


        return getTweetResDto;
    }
}
