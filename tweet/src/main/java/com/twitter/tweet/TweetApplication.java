package com.twitter.tweet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TweetApplication {

	public static void main(String[] args) {
		SpringApplication.run(TweetApplication.class, args);
	}

}
