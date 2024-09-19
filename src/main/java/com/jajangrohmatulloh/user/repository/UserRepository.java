package com.jajangrohmatulloh.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jajangrohmatulloh.user.entity.User;
import com.jajangrohmatulloh.user.model.UserProjection;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<UserProjection> findByFullNameContaining(String fullName);

}