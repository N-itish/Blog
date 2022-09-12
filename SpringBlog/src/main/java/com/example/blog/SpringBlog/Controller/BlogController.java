package com.example.blog.SpringBlog.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.blog.SpringBlog.Entity.Category;
import com.example.blog.SpringBlog.Entity.Post;
import com.example.blog.SpringBlog.Service.CategoryService;
import com.example.blog.SpringBlog.Service.PostService;

@Controller
public class BlogController {
	
	@Autowired
	private CategoryService catService;
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Category> categories = catService.getAll();
		model.addAttribute("categoryList",categories);
		return "index";
	}
	
	@GetMapping("/blog/{category_id}")
	public String blogPost(@PathVariable(value="category_id") int category_id,Model model){
		List<Post> posts = postService.getPostUsingCatId(category_id);
		model.addAttribute("posts",posts);
		return "blog";
	}
	
}
