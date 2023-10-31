package com.twitter.tweet.http;

import com.twitter.tweet.dto.GetUserResDto;
import com.twitter.tweet.model.User;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", url = "http://localhost:8083")
public interface UserHttp {

    @GetMapping("/users/{userId}")
    public GetUserResDto getUser(@PathVariable int userId);
}
