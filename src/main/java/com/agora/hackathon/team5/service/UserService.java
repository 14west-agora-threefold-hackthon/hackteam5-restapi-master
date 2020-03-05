package com.agora.hackathon.team5.service;

import java.util.List;

import com.agora.hackathon.team5.model.User;

public interface UserService {

	User findByID(String id);

	User findByUsername(String username);

	User findByUsernameAndPassword(String username, String password);

	User findUser(String username, String password);

	List<User> findAllUser();

	void deleteAllUser();

}
