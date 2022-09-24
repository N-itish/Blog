package com.example.blog.SpringBlog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.SpringBlog.Entity.Comment;
import com.example.blog.SpringBlog.Respository.CommentRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository repo;
	
	public List<Comment> getAll(){
		return this.repo.findAll();
	}
}