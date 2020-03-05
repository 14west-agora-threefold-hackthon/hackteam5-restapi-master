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
import com.agora.hackathon.team5.model.User;
import com.agora.hackathon.team5.service.UserService;

@RestController
//@RequestMapping("/login")
@RequestMapping(value = "/api/user", produces = "application/json")
public class UserController {

	@Autowired
	UserService loginService;

	@GetMapping( "/all")
	public Iterable<User> findAllUser() {
		return loginService.findAllUser();
	}

	@GetMapping( "/id/{id}")
	public User findUserByID(@PathVariable String id, HttpServletRequest request) {
		return loginService.findByID(id);
	}

	@GetMapping( "/username/{username}")
	public User findUserByUsername(@PathVariable String username, HttpServletRequest request) {
		return loginService.findByUsername(username);
	}

	@RequestMapping(value = "/username/{username}/password/{password}", method = RequestMethod.GET)
	public User findUserByUsernameAndPassword(@PathVariable String username, @PathVariable String password, HttpServletRequest request) {
		return loginService.findByUsernameAndPassword(username, password);
	}

	@GetMapping("/delete/all")
	public void deleteAllUser(){
		loginService.deleteAllUser();
	}

	@RequestMapping(value = "/username2/{username}/password2/{password}", method = RequestMethod.GET)
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
