package com.cp.social;

import java.util.Date;

public class Post {

	private int id;
	private String postContent;
	private Date timeStamp;
	private int upVote = 0;
	private int downvote = 0;
	private String userName;
	
	
	
	public Post(int id,String userName,String postContent) {
		
		this.id = id;
		this.userName = userName;
		this.postContent = postContent;
		this.timeStamp = new Date();
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getUpVote() {
		return upVote;
	}
	public void setUpVote(int upVote) {
		this.upVote = upVote;
	}
	public int getDownvote() {
		return downvote;
	}
	public void setDownvote(int downvote) {
		this.downvote = downvote;
	}

	@Override
	public String toString() {
		return "id: " + id  +"\n("+ upVote + " upVote, " + downvote+ " downvote)"+"\n"+userName+"\n"+postContent+"\n" + timeStamp;
	}
	
	
	
}
