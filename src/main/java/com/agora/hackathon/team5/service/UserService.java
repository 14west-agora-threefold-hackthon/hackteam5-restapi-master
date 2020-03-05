package com.agora.hackathon.team5.service;

import java.util.List;

import com.agora.hackathon.team5.model.User;

public interface UserService {

	User findByUsername(String username);

	User findUser(String username, String pasword);

	List<User> findAllUser();
}
