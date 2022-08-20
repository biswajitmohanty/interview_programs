package com.coding.designpattern;

import com.coding.designpattern.User.UserBuilder;

public class UserRetriver {
	public static void main(String [] args) {
		User u = new User.UserBuilder("Biswa").email("@email").build();
	}
}
