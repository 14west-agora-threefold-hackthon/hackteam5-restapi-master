package com.agora.hackathon.team5.model;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	private Long ID;

	private String username;

	private String password;
	
	private String firstName;
	
	private String lastName;

	public User() {
	}
	
	public User(Long ID, String username, String password, String firstName, String lastName) {
		this.ID = ID;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
