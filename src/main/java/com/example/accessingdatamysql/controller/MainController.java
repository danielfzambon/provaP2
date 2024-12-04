package com.example.accessingdatamysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.accessingdatamysql.DTO.User;
import com.example.accessingdatamysql.Repository.UserRepository;

@Controller	
@RequestMapping(path="/user") 
public class MainController {
	
	@Autowired 			   
	private UserRepository userRepository;

	@PostMapping(path="/add") 
	public @ResponseBody String addNewUser (@RequestParam String name , @RequestParam String email) {

		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		System.out.println("foi");
		return userRepository.findAll();
	}
}
