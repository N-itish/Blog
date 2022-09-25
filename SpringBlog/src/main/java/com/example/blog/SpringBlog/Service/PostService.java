package com.example.blog.SpringBlog.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.SpringBlog.Entity.Post;
import com.example.blog.SpringBlog.Respository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository repo;
	
	public List<Post> getPostUsingCatId(int category_id) {
		
		return repo.getPosts(category_id);
	}
	
	public Post getPostById(int post_id) {
		Optional<Post> result = repo.findById(post_id);
		if(result.get() == null) {
			return new Post();
		}
		return result.get();
	}
}
