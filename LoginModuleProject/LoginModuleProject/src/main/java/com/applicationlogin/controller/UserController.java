package com.applicationlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applicationlogin.model.User;
import com.applicationlogin.repository.IUserRepo;
import com.applicationlogin.response.Response;
import com.applicationlogin.serviceimpl.UserServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
	 
	@Autowired
	UserServiceImpl userServiceImpl;
	@Autowired
	private IUserRepo iUserRepo;
	
	
		
	
	
	@PostMapping("/login")
	public Response getLoginDetails(@RequestBody User user) {
		
		
		return userServiceImpl.getUserDetail(user);
		
	}
	
	
	@GetMapping("/userList")
	public List<User> getUserList(){
		List<User> findAll = this.iUserRepo.findAll();
		return findAll;
		
	}

}
