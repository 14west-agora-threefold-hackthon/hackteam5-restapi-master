package com.agora.hackathon.team5.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String msg, Throwable e) {
		super(msg, e);
	}

	public UserNotFoundException(String msg) {
		super(msg);
	}

	public UserNotFoundException(Throwable msg) {
		super(msg);
	}

}
