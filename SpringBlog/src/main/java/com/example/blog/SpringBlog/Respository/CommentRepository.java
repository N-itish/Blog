package com.example.blog.SpringBlog.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.blog.SpringBlog.Entity.Comment;

public interface CommentRepository extends JpaRepository<Comment,Integer>{
	@Query("SELECT c FROM Comment c where post_id = :pid")
	List<Comment> findCommentsByPostId(@Param("pid") int pid);
	
}
