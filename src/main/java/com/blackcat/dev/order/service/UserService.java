/**
 * 
 */
package com.blackcat.dev.order.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.blackcat.dev.order.model.User;

/**
 * Jun 30, 2020
 *
 */
@FeignClient(name="userclient")
public interface UserService {

	@GetMapping( value = "/")
	List<User> getAllUser();

}
