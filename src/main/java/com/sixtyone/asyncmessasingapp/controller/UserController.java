package com.sixtyone.asyncmessasingapp.controller;


import com.sixtyone.asyncmessasingapp.dtos.UserDto;
import com.sixtyone.asyncmessasingapp.services.UserDAOService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/users",consumes = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private UserDAOService userDAOService;


    public UserController (UserDAOService service) {
        this.userDAOService = service;
    }
    @PostMapping(path = "/save")
    public ResponseEntity<Map<String,Object>> postNewUser(@RequestBody UserDto user) {
        userDAOService.insertNewUser(user);
        return  ResponseEntity.ok(Map.of("success",true,"message","User saved succesfully"));
    }
}