package com.cp.social;

import java.util.Map;

public class ShowNewsFeed {
	
	public void getNewsFeed(User user){
		
		getFeed(user);
		
		if(!user.getFollowingUsers().isEmpty()) {
			for(User followingUser : user.getFollowingUsers()) {
				getFeed(followingUser);
			}
		}
	}
	
	private static void getFeed(User user) {
		
		for(Map.Entry<Integer, Post> post : user.getPosts().entrySet()) {
			System.out.println(post.getValue().toString());
		}
	}

}
