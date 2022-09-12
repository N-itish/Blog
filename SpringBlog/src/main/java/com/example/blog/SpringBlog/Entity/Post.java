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
@Table(name="posts")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	private int post_id;
	
	@Column(name = "title")
	private String title;

	@Column(name = "content")
	private String content;
	

	@Column(name = "image_url")
	private String image_url;
	
	@OneToMany
	@JoinColumn(name="user_id")
	private Set<User> user;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	
	public Post() {
		super();
	}

	public Post(int post_id, String title, String content, String image_url, Set<User> user, Category category) {
		super();
		this.post_id = post_id;
		this.title = title;
		this.content = content;
		this.image_url = image_url;
		this.user = user;
		this.category = category;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}


	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
