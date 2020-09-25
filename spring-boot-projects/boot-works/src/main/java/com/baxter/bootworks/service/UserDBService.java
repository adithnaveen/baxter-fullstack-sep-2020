package com.baxter.bootworks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baxter.bootworks.beans.User;
import com.baxter.bootworks.repo.UserRepository;

@Service
public class UserDBService {

	@Autowired
	private UserRepository repository; 
	
	public User getUserById(Integer id) {
		return repository.findById(id).get(); 
	}
	

	public List<User> getAllUsers() {
		return repository.findAll(); 
	}
	
	public User insertUser(User user) {
		return repository.insert(user); 
	}
	
	// upsert = update + insert (_id) 
	public User updateUser(User user) {
		return repository.save(user); 
	}
	
	
	public void deleteUser(Integer id) {
		repository.deleteById(id);
	}
}









