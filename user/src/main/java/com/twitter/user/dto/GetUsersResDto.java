package com.twitter.user.dto;

import com.twitter.user.model.User;

import java.util.List;

public class GetUsersResDto {
    public boolean isSuccess;
    public String message;
    public List<User> users;
}
