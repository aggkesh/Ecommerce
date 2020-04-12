package com.ecommerce.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.userservice.models.User;
import com.ecommerce.userservice.models.UserDto;
import com.ecommerce.userservice.service.UserDetailService;

/**
 * User Controller
 * 
 * @author keshavaggarwal
 *
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserDetailService userDetailService;
	
	@GetMapping
	public List<UserDto> getUsers() {
		return userDetailService.getUsers();
	}
	
	@GetMapping("{userId}")
	public UserDto getUserById(@PathVariable String userId) throws RuntimeException {
		return userDetailService.getUserById(userId);
	}

    @PostMapping
    public void addUser(@RequestBody User user) {
    	userDetailService.addUser(user);
    }

    @PutMapping("{userId}")
    public void updateUser(@PathVariable String userId, @RequestBody UserDto userDto) {
    	userDetailService.updateUser(userId, userDto);
    }

    @DeleteMapping("{userId}")
    public void deleteUser(@PathVariable String userId) {
    	userDetailService.deleteUser(userId);
    }
}
