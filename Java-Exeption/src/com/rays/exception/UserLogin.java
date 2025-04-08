package com.rays.exception;

public class UserLogin {
	public static void main(String[] args) throws LoginException {
		String login = "admin";
		String password = "admin";

		if (login == "admin" && password == "admin") {
			System.out.println("Login Succesfully");
		} else {
			throw new LoginException("lofin or password is invalid");
		}

	}
}
