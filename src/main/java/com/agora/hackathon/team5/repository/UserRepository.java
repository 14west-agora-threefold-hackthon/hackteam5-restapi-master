package com.agora.hackathon.team5.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agora.hackathon.team5.model.User;

public interface UserRepository  extends MongoRepository<User, Long> {

	public User findByUsername(String username);

}
