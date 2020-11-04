package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServices {

	@Autowired UserRepository userRepository;
	
	public void createUser(User user) {
		
		userRepository.save(user);
		
	}
	
	public List<User> findAll(){
		
		return userRepository.findAll();
	}
}
