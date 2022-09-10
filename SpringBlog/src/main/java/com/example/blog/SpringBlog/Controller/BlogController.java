package com.example.blog.SpringBlog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.blog.SpringBlog.Entity.User;
import com.example.blog.SpringBlog.Service.UserService;

@Controller
public class BlogController {
	@Autowired
	private UserService service;
	
	@ResponseBody
	@GetMapping("/hello")
	public User Hello() {
		return service.getUser(1);
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
