package com.twitter.user.repository;

import com.twitter.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<User> userList = new ArrayList<>();

    public void save(User user) {
        int size = userList.size();
        user.id  = size + 1;
        userList.add(user);
    }

    public List<User> findAll() {
        return userList;
    }

    public User findByUserId(int userId) {
        return userList.stream().filter(user -> user.id == userId).findFirst().orElse(null);
    }
}
