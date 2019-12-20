package com.nosorio.nosql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nosorio.nosql.models.User;
import com.nosorio.nosql.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class MongoController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping({"/", ""})
	public List<User> getAll() {
		return this.userRepository.findAll();
	}
	
	@PostMapping({"/", ""})
	public void create(@RequestBody User user) {
		System.out.println("User: " + user.getName());
		this.userRepository.insert(user);
	}
}
