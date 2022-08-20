package com.coding.designpattern;

public final class User {

 private final String name;
 private final String email;
 
 private User(UserBuilder u) {
	 this.name = u.name;
	 this.email = u.email;
 }
 
 public static class UserBuilder {
	 private final String name;
	 private  String email;
	 
	 public UserBuilder(String name) {
		 this.name = name;
	 }
	 public  UserBuilder email(String email) {
		 this.email = email;
		 return this;
	 }
	 
	 public User build() {
		 User user = new User(this);
		 //validation of user oibjcet
		 return user;
	 }
	 
 }
 
 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name "+ this.name +", email " + this.email;
	}
	
	
}
