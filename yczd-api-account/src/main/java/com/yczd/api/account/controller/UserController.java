package com.yczd.api.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yczd.api.account.domain.User;
import com.yczd.api.account.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/account/users")
	public List<User> users() {
		return userService.findAll();
	}

	@PostMapping(value = "/account/users")
	public User save(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping(value = "/account/users/{id}")
	public User user(@PathVariable String id) {
		return userService.findById(id);

	}

	@DeleteMapping(value = "/account/users/{id}")
	public User delete(@RequestBody User user) {
		userService.delete(user);
		return user;
	}

	@PatchMapping(value = "/account/users/{id}")
	public User update(@RequestBody User user) {
		return userService.save(user);
	}

}
