package com.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.entity.UserEntity;
import com.spring.jpa.service.UserService;

@RestController
@RequestMapping("/user/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveUser")
	public UserEntity saveUser(@RequestBody UserEntity userEntity) {
		return userService.saveUserEntity(userEntity);
	}

	@PostMapping("/getAllUsers")
	public List<UserEntity> getAllUsersDetails() {
		return userService.getAllUsers();
	}

	@GetMapping("/findUserById/{id}")
	public UserEntity findUserById(@PathVariable Long id) {
		return userService.findByUserId(id);
	}
}
