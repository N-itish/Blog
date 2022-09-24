package com.example.blog.SpringBlog.Entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
	@Id
	@Column(name = "comment_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int comment_id;
	
	@OneToMany
	@JoinColumn(name = "user_id")
	private Set<User> user_id;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;
	
	@Column(name = "comment")
	private String comment;

	public Comment() {
		super();
	}

	public Comment(int comment_id, Set<User> user_id, Post post, String comment) {
		super();
		this.comment_id = comment_id;
		this.user_id = user_id;
		this.post = post;
		this.comment = comment;
	}

	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public Set<User> getUser_id() {
		return user_id;
	}

	public void setUser_id(Set<User> user_id) {
		this.user_id = user_id;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
	
	

}
