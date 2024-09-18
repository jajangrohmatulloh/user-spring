package com.jajangrohmatulloh.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jajangrohmatulloh.user.entity.User;
import com.jajangrohmatulloh.user.model.UserProjection;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    @Query("select u from users u where u.full_name like %?1%")
    List<UserProjection> findByFullNameLike(String fullName);
    
}