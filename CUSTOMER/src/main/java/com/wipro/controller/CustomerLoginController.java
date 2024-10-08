package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.model.CustomerLogin;
import com.wipro.service.CustomerLoginServiceImpl;



@RestController
public class CustomerLoginController {

	@Autowired
	CustomerLoginServiceImpl customerLoginService;
	
	
	//endpoint for retreiving the record 
		@GetMapping(value = "/user")
		public String home()
		{
			return "Halidram web Page";
			
			
		}
		
		// we were setting the data in the database through Model entity class
		// Now we will fetch the data from model class and set it in a 
		// attribute(Setting the data in an object form)
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") CustomerLogin user, Model model) {
		
		customerLoginService.saveUserDetails(user);
	     model.addAttribute("username", user.getUsername());
		
		return "welcome";
	}
	
	/* @PostMapping("/save")
	    public String saveTask(@ModelAttribute CustomerLogin user) {
		 customerLoginService.saveUserDetails(user);
			
	        return "redirect:/";
	    }*/
	
}
