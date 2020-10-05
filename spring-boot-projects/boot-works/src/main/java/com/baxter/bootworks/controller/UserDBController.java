package com.baxter.bootworks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.baxter.bootworks.beans.User;
import com.baxter.bootworks.service.UserDBService;

@RestController
public class UserDBController {

	@Autowired
	private UserDBService service;

	

	@GetMapping(path = "/")
	public  String helloWorld() {
		return "Workding user controller"; 
	}

	
	@GetMapping(path = "/db/users") //  , produces = {"application/json", "application/xml"})
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}
//
//	// 110 -> no record 
//	// http://localhost:7676/db/users/101 
//	@GetMapping(path="/db/users/{id}")
//	public HttpEntity<Object> getUser(@PathVariable("id") Integer id) throws UserNotFoundException {
//		try {
//		
//			 Optional<User> userOptional = service.getUserByIdOptional(id); 
//			 
//			 if(userOptional.isPresent()) {
//				 User user = userOptional.get();
//				 user.add(linkTo(methodOn(UserDBController.class).getAllUsers()).withSelfRel()); 
//			System.out.println("Got User is " + user);
//				 return new ResponseEntity<>(user, HttpStatus.OK); 
////				 return user; 
//			 }
//			 
//			 userOptional.orElseThrow(() -> {
//				 return new UserNotFoundException("Sorry UserId : " + id +" Not Found");
//			 }); 
//			
//		}catch(UserNotFoundException unfe) {
//			unfe.printStackTrace();
//			throw new UserNotFoundException(unfe.getMessage() +" from Controller"); 
//		}
//		return null;
//	}

	@PostMapping(path = "/db/users") 
	@ResponseStatus(code=HttpStatus.CREATED)
	public User inserUser(@RequestBody User user) {
		System.out.println("Insert with V1 ");
		return service.insertUser(user); 
	}

	@PostMapping(path ="v1/db/users")
	@ResponseStatus(code=HttpStatus.CREATED)
	public User inserUserV1(@RequestBody User user) {
		System.out.println("Insert with V2");
		return service.insertUser(user); 
	}
	
	@DeleteMapping("/db/users/{id}")
	public String deleteUser(@PathVariable Integer id) {
		if(service.getUserByIdOptional(id).isPresent()) {
			service.deleteUser(id);
			return "Record : "+ id +" deleted"; 
		}
		
		return "Record Not Found " + id; 
	}
	
	@PutMapping("/db/users")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user); 
	}

}










