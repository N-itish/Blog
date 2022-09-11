package com.example.blog.SpringBlog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.blog.SpringBlog.Service.CategoryService;

@Controller
public class BlogController {
	
	@Autowired
	private CategoryService catService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("categoryList",this.catService.getAll());
		return "index";
	}
	
}
