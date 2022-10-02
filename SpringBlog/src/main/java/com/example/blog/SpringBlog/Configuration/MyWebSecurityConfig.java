package com.example.blog.SpringBlog.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class MyWebSecurityConfig   {
	@Bean SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.authorizeRequests((requests)->{
			requests.antMatchers("/","/blogList/**","/styles/**").permitAll().anyRequest().authenticated();
		}).formLogin((form)-> form.loginPage("/login").permitAll()).logout( (logout) -> logout.permitAll());
		return http.build();
	}
}
