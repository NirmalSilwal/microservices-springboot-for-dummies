package com.user.service.impl;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // dummy dataset
    List<User> users = List.of(
            new User(100L, "Nirmal Silwal", "1234567890"),
            new User(200L, "Dinesh Sarma", "90876453211"),
            new User(300L, "Saugat Pageni", "2341658790"),
            new User(400L, "Puru Dai", "5674321890"),
            new User(500L, "Asis Pokhrel", "6789054321")
    );

    @Override
    public User getUser(Long userId) {
        return this.users.stream()
                .filter(c -> c.getUserId().equals(userId))
                .findAny().
                orElse(null);
    }
}
