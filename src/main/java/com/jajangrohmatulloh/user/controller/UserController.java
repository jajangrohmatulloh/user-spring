package com.jajangrohmatulloh.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jajangrohmatulloh.user.model.WebRequest;
import com.jajangrohmatulloh.user.model.WebResponse;
import com.jajangrohmatulloh.user.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse getUsersByFullName(@RequestBody WebRequest request) {

        String fullName = request.getFullName();
        WebResponse users = userService.findByFullNameContaining(fullName);

        return users;
    }

}