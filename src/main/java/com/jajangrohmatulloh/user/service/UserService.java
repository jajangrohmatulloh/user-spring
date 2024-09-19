package com.jajangrohmatulloh.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jajangrohmatulloh.user.model.WebResponse;
import com.jajangrohmatulloh.user.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public WebResponse findByFullNameContaining(String fullName) {
        List<String> users = new ArrayList<>();
        userRepository.findByFullNameContaining(fullName).forEach(user -> users.add(user.fullName()));

        return WebResponse.builder().users(users).build();
    }
}
