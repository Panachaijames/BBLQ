package com.example.demo;


import com.example.demo.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class userService {

    private final Map<Long, User> users = new HashMap<>();
    private long nextId = 1;

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User getUserById(Long id) {
        return users.get(id);
    }

    public User createUser(User user) {
        user.setId(nextId++);
        users.put(user.getId(), user);
        return user;
    }

    public User updateUser(Long id, User user) {
        if (!users.containsKey(id)) return null;
        user.setId(id);
        users.put(id, user);
        return user;
    }

    public boolean deleteUser(Long id) {
        return users.remove(id) != null;
    }
}

