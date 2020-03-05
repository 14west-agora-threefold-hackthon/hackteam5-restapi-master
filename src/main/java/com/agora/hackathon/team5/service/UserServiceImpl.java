package com.agora.hackathon.team5.service;

import java.util.List;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Service;

import com.agora.hackathon.team5.model.User;
import com.agora.hackathon.team5.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository){
		this.userRepository = userRepository;
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public List<User> findAllUser() {
		
		userRepository.save(new User(RandomUtils.nextLong(), "barry", "1234", "Barry", "Thomas"));
		userRepository.save(new User(RandomUtils.nextLong(), "rkim", "5678", "Ryan", "Kim"));

		return userRepository.findAll();
	}

	@Override
	public User findUser(String username, String password) {
		User user = null;

		/*
			Check out whether the user with the username and password exist in the User Collection.
			If the user exists, return User object
			If not, return null
		*/
		if (username != null && password != null) {
			if (username.equalsIgnoreCase("barry") && password.equalsIgnoreCase("1234")) {
				user = new User();
				user.setID(1L);
				user.setUsername(username);
				user.setPassword(password);
				user.setFirstName("Barry");
				user.setLastName("Thomas");
			}
		}
		return user;
	}
}
