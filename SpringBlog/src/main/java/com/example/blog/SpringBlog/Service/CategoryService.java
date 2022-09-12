package com.example.blog.SpringBlog.Service;

import java.util.List;
import java.util.Optional;

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
	
	public Category findById(int id) {
		Optional<Category> myCategory = repo.findById(id);
		if(myCategory.get() == null) {
			return new Category();
		}
		return myCategory.get();	
	}
}
