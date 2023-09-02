package com.application.boop.authentication.service;

import com.application.boop.authentication.model.User;
import com.application.boop.authentication.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Long login(String email,Long id){
        Optional<User> user = userRepository.getByEmail(email,id);
        return user.isPresent() ? user.get().getId() : null;
    }

    public User register(User user){
        userRepository.save(user);
        return user;
    }
}

