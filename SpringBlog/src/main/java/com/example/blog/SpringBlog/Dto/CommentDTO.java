package com.example.blog.SpringBlog.Dto;

import com.example.blog.SpringBlog.Entity.Post;
import com.example.blog.SpringBlog.Entity.User;

public class CommentDTO {
	private  int user_id;
	private  int post_id;
	private  String comment;
	
	public CommentDTO() {
		super();
	}

	public CommentDTO(int user_id, int post_id, String comment) {
		super();
		this.user_id = user_id;
		this.post_id = post_id;
		this.comment = comment;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
