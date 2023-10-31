package com.twitter.user.service;

import com.twitter.user.dto.CreateUserReqDto;
import com.twitter.user.model.User;
import com.twitter.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public void createUser(CreateUserReqDto createUserReqDto) {
        User user = new User(createUserReqDto.name, createUserReqDto.age, createUserReqDto.gender);
        this.userRepository.save(user);
    }

    public List<User> getUsers() {
       return this.userRepository.findAll();
    }

    public User getUser(int userId) {
        User user = this.userRepository.findByUserId(userId);
        return user;
    }

}
