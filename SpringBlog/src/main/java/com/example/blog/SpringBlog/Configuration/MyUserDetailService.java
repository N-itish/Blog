package com.example.blog.SpringBlog.Configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.blog.SpringBlog.Entity.User;
import com.example.blog.SpringBlog.Respository.UserRepository;


@Component
public class MyUserDetailService implements UserDetailsService{
    @Autowired
    private UserRepository userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	User user = userRepo.findByName(username);
        return new MyPrincipal(user);
    }
}
