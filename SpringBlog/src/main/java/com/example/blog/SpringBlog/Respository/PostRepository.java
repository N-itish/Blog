package com.example.blog.SpringBlog.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.blog.SpringBlog.Entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{
	@Query(value = "select p from Post p where category_id = :cat_id")
	List<Post> getPosts(@Param("cat_id") int cat_id);
}
