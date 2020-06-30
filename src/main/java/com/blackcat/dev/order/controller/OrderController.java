/**
 * 
 */
package com.blackcat.dev.order.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackcat.dev.order.model.User;
import com.blackcat.dev.order.service.UserService;

/**
 * Jun 29, 2020
 *
 */
@RestController
@RefreshScope
@RequestMapping
public class OrderController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<Collection<User>> getAllUsers(){
		return ResponseEntity.ok().body(userService.getAllUser());
	}

}
