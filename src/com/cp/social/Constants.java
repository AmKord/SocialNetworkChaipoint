package com.cp.social;

public class Constants {
	
	public static final String SIGNUP = "signup";
	public static final String LOGIN = "login";
	public static final String POST = "post";
	private static int postIdCounter = 1;
	
	public static int getPostId() {
				
		return postIdCounter++;
	}

}
