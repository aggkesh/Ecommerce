package com.ecommerce.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception thrown when error occur during processing of request
 * 
 * @author keshavaggarwal
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	/**
	 * Default Serial Version UID User Not Found Exception
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String userId) {
		super("User with given user id " + userId + " not found");
	}
	
}
