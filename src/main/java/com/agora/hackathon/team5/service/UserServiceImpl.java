package com.agora.hackathon.team5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agora.hackathon.team5.model.User;
import com.agora.hackathon.team5.repository.CustomUserRepository;
import com.agora.hackathon.team5.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	private CustomUserRepository customUserRepository;

	public UserServiceImpl(UserRepository userRepository){
		this.userRepository = userRepository;
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public 	User findByUsernameAndPassword(String username, String password) {
		return customUserRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public List<User> findAllUser() {
		
		userRepository.save(new User("000012345678", "bthomas", "1234", "Barry", "Thomas"));
		userRepository.save(new User("000034567890", "rkim", "5678", "Ryan", "Kim"));
		userRepository.save(new User("000076466861", "msuch", "7890", "Mike", "Such"));

		return userRepository.findAll();
	}

	@Override
	public void deleteAllUser() {
		userRepository.deleteAll();
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
			if (username.equalsIgnoreCase("bthomas") && password.equalsIgnoreCase("1234")) {
				user = new User();
				user.setID("000012345678");
				user.setUsername(username);
				user.setPassword(password);
				user.setFirstName("Barry");
				user.setLastName("Thomas");
			}
		}
		return user;
	}
}
