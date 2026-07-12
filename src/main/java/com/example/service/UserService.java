package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.model.User;

@Service
public class UserService {

    private final Map<Long, User> users = new ConcurrentHashMap<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    public User create(User user) {
        user.setId(idCounter.getAndIncrement());
        users.put(user.getId(), user);
        return user;
    }

    public Optional<User> update(Long id, User updated) {
        return Optional.ofNullable(users.computeIfPresent(id, (key, existing) -> {
            existing.setName(updated.getName());
            existing.setEmail(updated.getEmail());
            return existing;
        }));
    }

    public boolean deleteById(Long id) {
        return users.remove(id) != null;
    }
}
