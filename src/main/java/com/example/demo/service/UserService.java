package com.example.demo.service;

import com.example.demo.entities.User;

public interface UserService {
	
	public User findByUsername(String username);

}
