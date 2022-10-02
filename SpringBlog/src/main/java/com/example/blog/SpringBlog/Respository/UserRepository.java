package com.example.blog.SpringBlog.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.SpringBlog.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	User findByName(String name);
}
