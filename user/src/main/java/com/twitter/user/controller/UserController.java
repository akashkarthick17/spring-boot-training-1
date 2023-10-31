package com.twitter.user.controller;

import com.twitter.user.dto.CreateUserReqDto;
import com.twitter.user.dto.CreateUserResDto;
import com.twitter.user.dto.GetUserResDto;
import com.twitter.user.dto.GetUsersResDto;
import com.twitter.user.model.User;
import com.twitter.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping
    public CreateUserResDto createUser(@RequestBody CreateUserReqDto createUserReqDto) {
        System.out.println(createUserReqDto.name);
        this.userService.createUser(createUserReqDto);
        CreateUserResDto createUserResDto = new CreateUserResDto();
        createUserResDto.isSuccess = true;
        createUserResDto.message = "Successfully Created!";

        return createUserResDto;
    }

    @GetMapping
    public GetUsersResDto getUsers() {
        GetUsersResDto getUserResDto = new GetUsersResDto();
        getUserResDto.isSuccess = true;
        getUserResDto.message = "Successfully Fetched!";
        getUserResDto.users = this.userService.getUsers();

        return getUserResDto;
    }

    @GetMapping("/{userId}")
    public GetUserResDto getUsers(@PathVariable int userId) {
        GetUserResDto getUserResDto = new GetUserResDto();

        User user = this.userService.getUser(userId);
        if(user == null) {
            getUserResDto.isSuccess = false;
            getUserResDto.message = "User not found!!";
        } else {
            getUserResDto.isSuccess = true;
            getUserResDto.message = "Successfully Fetched!";
            getUserResDto.user = user;
        }

        return getUserResDto;
    }
}
