package com.example.demo.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.User;
import com.example.demo.services.RoleServices;
import com.example.demo.services.UserServices;


@Controller
public class UserController {
	
	@Autowired UserServices userServices;
	
	@Autowired RoleServices roleServices;
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String ajout(Model model){
        model.addAttribute("user", new User());
        
        model.addAttribute("roles", roleServices.findAll());
        
        return ("user/ajout");
    }
	
	
	@RequestMapping(value ="/addUser", method = RequestMethod.POST)
    public String ajout(@Validated User user, BindingResult bindingResult, Model model) {

		 model.addAttribute("user", new User());
	       
	        System.out.println(roleServices.findAll());
	        
	        model.addAttribute("roles", roleServices.findAll());
	        
        if(bindingResult.hasErrors()) {
        	return ("user/ajout");
        }
        
        userServices.createUser(user);

        return "redirect:/listUser";
    }
	
	@GetMapping("/listUser")
	public String list(Model model) {
		
		java.util.List<User> user = userServices.findAll();
		
		model.addAttribute("users", user);
		
		
		
		return "user/list";
	}

}
