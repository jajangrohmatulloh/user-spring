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
        List<String> DBFullNames = new ArrayList<>();
        userRepository.findByFullNameContaining(fullName).forEach(user -> DBFullNames.add(user.fullName()));

        return WebResponse.builder().DBFullNames(DBFullNames).build();
    }
}
