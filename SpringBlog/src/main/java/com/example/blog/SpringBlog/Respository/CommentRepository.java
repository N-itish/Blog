package com.example.blog.SpringBlog.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.SpringBlog.Entity.Comment;

public interface CommentRepository extends JpaRepository<Comment,Integer>{

}
