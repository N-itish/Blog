package com.example.blog.SpringBlog.Service;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.SpringBlog.Entity.User;
import com.example.blog.SpringBlog.Respository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User getUser(int id) {
		Optional<User> returnedUser= userRepo.findById(id);
		if(returnedUser.get() == null) {
			return new User();
		}
		return returnedUser.get();
	}
}
