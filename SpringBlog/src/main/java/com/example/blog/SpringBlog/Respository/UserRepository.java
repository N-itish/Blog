package com.example.blog.SpringBlog.Respository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.blog.SpringBlog.Entity.Comment;
import com.example.blog.SpringBlog.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	User findByName(String name);
	
	@Query("SELECT u FROM User u where user_id = :uid")
	Set<User> findUserssByPostId(@Param("uid") int uid);
}
