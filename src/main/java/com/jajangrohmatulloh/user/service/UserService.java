package com.jajangrohmatulloh.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jajangrohmatulloh.user.model.UserProjection;
import com.jajangrohmatulloh.user.model.WebResponse;
import com.jajangrohmatulloh.user.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public WebResponse getAllByFullName(String fullName) {
        List<UserProjection> users = userRepository.findByFullNameLike(fullName);

        return WebResponse.builder().users(users).build();
    }
}
