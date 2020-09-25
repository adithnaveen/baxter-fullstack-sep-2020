package com.baxter.bootworks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baxter.bootworks.beans.User;
import com.baxter.bootworks.service.UserDBService;

@RestController
public class UserDBController {
	
	@Autowired
	private UserDBService service; 
	
	
	@GetMapping(path="/db/users")
	public List<User> getAllUsers() {
		return service.getAllUsers(); 
	}
	
}
