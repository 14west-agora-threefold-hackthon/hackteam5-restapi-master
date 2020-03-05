package com.agora.hackathon.team5.repository;

import org.springframework.data.repository.Repository;

import com.agora.hackathon.team5.model.User;

public interface CustomUserRepository extends Repository<User, Long> {

//    @Query("{'username' : ?0, 'password' : ?0}")
    public User findByUsernameAndPassword(String username, String password);

}
