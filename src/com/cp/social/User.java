package com.cp.social;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class User {
	
	private int id;
	private String userName;
	private Map<Integer,Post> posts = new LinkedHashMap<Integer,Post>();
	private List<User> followingUsers = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

	public User(int id, String userName) {
		
		this.id = id;
		this.userName = userName;
		
	}
	
	public Map<Integer, Post> getPosts() {
		return posts;
	}
	
	public void setPosts(Map<Integer, Post> posts) {
		this.posts = posts;
	}
	public void postContent(String content) {
		int postId = Constants.getPostId();
		if(posts!=null) {
			posts.put(postId,new Post(postId,this.getUserName(),content));
		}
		else {
			posts.put(postId,new Post(postId,this.getUserName(), content));
		}
	}
	
	public List<User> getFollowingUsers() {
		return followingUsers;
	}
	public void setFollowingUsers(List<User> followingUsers) {
		this.followingUsers = followingUsers;
	}
	
	public void followUser(User user) {
		this.followingUsers.add(user);
		System.out.println(user.getUserName()+" followed successfully");
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", posts=" + posts + ", followingUsers=" + followingUsers
				+ "]";
	}
	
	
	

}
