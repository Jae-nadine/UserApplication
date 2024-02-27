package com.coderscampus.lesson4;

import com.coderscampus.lesson3.User;

public class UserApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		// business logic, magic happens in the services = what businesses pay software developers to do
		User trevorUser = userService.createUser("trevor@craftycodr.com", "password123");
		System.out.println(trevorUser);

	}

}
