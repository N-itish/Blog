package com.example.blog.SpringBlog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.SpringBlog.Entity.Category;
import com.example.blog.SpringBlog.Respository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repo;
	
	public List<Category> getAll() {
		return this.repo.findAll();
	}
}
