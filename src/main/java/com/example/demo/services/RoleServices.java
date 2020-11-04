package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Role;

@Service
public class RoleServices {
	
	@Autowired com.example.demo.repository.roleRepository roleRepository;

	public List<Role> findAll(){
		
		return roleRepository.findAll();
	}
}
