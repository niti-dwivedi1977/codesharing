package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.dao.CustomerRepository;
import com.wipro.model.CustomerLogin;

@Service
public class CustomerLoginServiceImpl {
	
	@Autowired
	CustomerRepository repo;
	
	public CustomerLogin saveUserDetails(CustomerLogin user)
	{
		
		return repo.save(user);
	}

}
