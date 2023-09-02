package com.application.boop.authentication.controller;

import com.application.boop.authentication.model.User;
import com.application.boop.authentication.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class Authentication {

    private final UserService userService;

    public Authentication(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/login",consumes = {"application/json"})
    public Map<String,Object> login(@RequestBody Map<String,Object> requestBody){
        Map<String,Object> responseObject = new HashMap<>();
        if(userService.login((String)requestBody.get("email"),Long.parseLong(requestBody.get("id").toString())) == null){
            responseObject.put("status",HttpStatus.NOT_FOUND);
            return responseObject;
        }
        responseObject.put("status",HttpStatus.OK);
        return responseObject;
    }

    @PostMapping("/register")
    public Map<String,Object> register(@RequestBody User user){
        Map<String,Object> responseObject = new HashMap<>();
        userService.register(user);
        responseObject.put("user",user);
        return responseObject;
    }

    @GetMapping("/check")
    public String check(){
        return "working";
    }

}
