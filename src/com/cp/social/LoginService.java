package com.cp.social;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class LoginService {
	
	static ShowNewsFeed newsFeed = new ShowNewsFeed();
	static User user = null;
	private static Map<String, User> userMap = null;

	public LoginService() {

		userMap = new HashMap<>();
	}

	public static Map<String, User> getLoginMap() {

		return userMap;
	}

	private static User loginUser(String userName) {
		if (!userMap.containsKey(userName)) {
			System.out.println("User not found with username: " + userName);
		} else {
			return userMap.get(userName);
		}
		return null;
	}

	private static void signupUser(String userName) {

		if (userMap.containsKey(userName)) {
			System.out.println("User Already Exists");
		} else {
			userMap.put(userName, new User(userMap.size() + 1, userName));
			System.out.println(userName+" successfully signed up");
		}
		//System.out.println(userMap.keySet().toString());
	}

	public static void handleUserInput(String nextInput, Scanner sc) {

		switch (nextInput.split("~")[0]) {

		case Constants.SIGNUP:
			LoginService.signupUser(nextInput.split("~")[1]);
			break;

		case Constants.LOGIN:
			user = LoginService.loginUser(nextInput.split("~")[1]);
			

			break;
		case "post":
			if(user!=null) {
				
				
				user.postContent(nextInput.split("~")[1]);
			}
			else {
				System.out.println("Please Login");
			}
			break;
		case "follow":
			if(validateUser(nextInput.split("~")[1])) {
				user.followUser(userMap.get(nextInput.split("~")[1]));
			}
			else {
				System.out.println("Enter valid user");
			}
				

			break;
		case "shownewsfeed":
			if(user!=null) {
				newsFeed.getNewsFeed(user);
			}
			else {
				System.out.println("Please Login");
			}
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

	private static boolean validateUser(String userName) {
		// TODO Auto-generated method stub
		if(userMap.containsKey(userName)) {
			return true;
		}
		return false;
		
	}

	

}
