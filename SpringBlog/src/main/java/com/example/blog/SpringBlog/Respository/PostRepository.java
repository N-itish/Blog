package com.example.blog.SpringBlog.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.blog.SpringBlog.Entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{
	@Query(value = "select * from posts where category_id = :category_id",nativeQuery = true)
	List<Post> getPosts(@Param("category_id") int category_id);
}
