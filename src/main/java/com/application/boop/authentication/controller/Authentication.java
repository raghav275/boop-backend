package com.application.boop.authentication.controller;

import com.application.boop.authentication.model.User;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authentication {

    @PostMapping("/auth/login")
    public Long login(@RequestBody User user){
        return user.getId();
    }
}
