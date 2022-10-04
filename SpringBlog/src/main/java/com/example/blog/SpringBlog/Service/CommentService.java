package com.example.blog.SpringBlog.Service;

import java.util.List;
import java.util.Set;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blog.SpringBlog.Dto.CommentDTO;
import com.example.blog.SpringBlog.Entity.Comment;
import com.example.blog.SpringBlog.Entity.Post;
import com.example.blog.SpringBlog.Entity.User;
import com.example.blog.SpringBlog.Respository.CommentRepository;
import com.example.blog.SpringBlog.Respository.PostRepository;
import com.example.blog.SpringBlog.Respository.UserRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PostRepository postRepo;
	
	public List<Comment> getAll(){
		return this.commentRepo.findAll();
	}
	
	public List<Comment> getCommnetsByPostId(int post_id) {
		return commentRepo.findCommentsByPostId(post_id);
	}
	
	public void saveComment(CommentDTO commentDTO) {
		Comment comment = new Comment();
		User user = null;
		Post post = null;
		Optional<User> userResult = userRepo.findById(commentDTO.getUser_id());
		Optional<Post> postResult = postRepo.findById(commentDTO.getPost_id());
		if( userResult == null) {
			user = new User();
		}else {
			user = userResult.get();
		}
		
		if( postResult == null) {
			post = new Post();
		}else {
			post = postResult.get();
		}
		comment.setUser(user);
		comment.setPost(post);
		comment.setComment(commentDTO.getComment());
		commentRepo.save(comment);	
	}
}
