package com.example.blog.SpringBlog.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.blog.SpringBlog.Entity.Category;
import com.example.blog.SpringBlog.Entity.Comment;
import com.example.blog.SpringBlog.Entity.Post;
import com.example.blog.SpringBlog.Service.CategoryService;
import com.example.blog.SpringBlog.Service.CommentService;
import com.example.blog.SpringBlog.Service.PostService;

@Controller
public class BlogController {
	
	@Autowired
	private CategoryService catService;
	
	@Autowired
	private PostService postService;
	
	@Autowired 
	private CommentService commentService;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Category> categories = catService.getAll();
		model.addAttribute("categoryList",categories);
		return "index";
	}
	
	@GetMapping("/blogList/{category_id}")
	public String getBlogListByCategory(@PathVariable(value="category_id") int category_id,Model model){
		List<Post> posts = postService.getPostUsingCatId(category_id);
		model.addAttribute("posts",posts);
		return "blogList";
	}
	
	@GetMapping("/blog/{post_id}")
	public String getBlogByPostId(@PathVariable(value="post_id") int post_id, Model model) {
		Post post = postService.getPostById(post_id);
		List<Comment> comment = commentService.getCommnetsByPostId(post_id);
		model.addAttribute("post",post);
		model.addAttribute("comment",comment);
		return "blog";
	}
	

	@GetMapping("/register")
	public String signUp() {
		return "register";
	}	
}
