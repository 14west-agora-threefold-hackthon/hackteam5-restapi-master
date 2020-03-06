package com.agora.hackathon.team5.service;

import java.util.List;

import com.agora.hackathon.team5.model.User;

public interface UserService {

	List<User> initUsers();
	
	List<User> listUsers();

	User findByID(String id);

	User findByUsername(String username);

	User findByUsernameAndPassword(String username, String password);

	void deleteAllUser();

	void deleteUserById(String id);

	void registerUser(User user);
	
	User findUser(String username, String password);

}
