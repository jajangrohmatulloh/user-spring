package com.jajangrohmatulloh.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import com.jajangrohmatulloh.user.model.WebResponse;
import com.jajangrohmatulloh.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse getUsersByFullName(@RequestBody String full_name) {
        WebResponse users = userService.getAllByFullName(full_name);
        return users;
    }
    
}