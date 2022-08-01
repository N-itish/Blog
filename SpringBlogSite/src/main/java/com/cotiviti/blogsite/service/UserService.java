package com.cotiviti.blogsite.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotiviti.blogsite.entities.User;
import com.cotiviti.blogsite.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public UserService() {}
	public void storeUser(User user) {
		userRepo.save(user);
	}
	
	public User getUser(int user_id) {
		Optional<User> user = userRepo.findById(user_id);
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}
}
