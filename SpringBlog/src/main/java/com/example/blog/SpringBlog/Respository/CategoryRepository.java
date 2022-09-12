package com.example.blog.SpringBlog.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.SpringBlog.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer>{
	
}
