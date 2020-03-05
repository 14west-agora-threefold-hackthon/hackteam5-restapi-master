package com.agora.hackathon.team5.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.agora.hackathon.team5.exception.UserNotFoundException;
import com.agora.hackathon.team5.model.Content;
import com.agora.hackathon.team5.model.User;
import com.agora.hackathon.team5.service.UserService;

@RestController
@RequestMapping("/login")
public class UserController {

	@Autowired
	UserService loginService;

	@GetMapping( "/user")
	public Iterable<User> findAllUser() {
		return loginService.findAllUser();
	}

	@GetMapping( "/username/{username}")
	public User findUserByUsername(@PathVariable String username) {
		return loginService.findByUsername(username);
	}

	/**
	 * Gets the {@link ServerStatusResponse} for the server.
	 *
	 * @return the {@link ServerStatusResponse} instance containing information about the server
	 */
	@RequestMapping(value = "/username/{username}/password/{password}", method = RequestMethod.GET)
	public @ResponseBody
	User findAccount(@PathVariable String username, @PathVariable String password, HttpServletRequest request) {
		System.out.println("B_token: " + request.getHeader("token"));
		System.out.println("B_username: " + username);
		System.out.println("B_password: " + password + "\n");
		
		User user  = loginService.findUser(username, password);

		if (user == null) {
			throw new UserNotFoundException("User not found for username [" + username + "], password [" + password + "].");
		}

		System.out.println("A_ID: " + user.getID());
		System.out.println("A_username: " + user.getUsername());
		System.out.println("A_password: " + user.getPassword());
		System.out.println("A_firstName: " + user.getFirstName());
		System.out.println("A_lastName: " + user.getLastName() + "\n");

		return user;
	}
	
}
