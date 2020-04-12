package com.ecommerce.aggregatorservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception thrown when error occur during api request of Order Detail
 * 
 * @author keshavaggarwal
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderDetailNotFoundException extends RuntimeException {

	/**
	 * Default Serial Version UID Order Detail Not Found Exception
	 */
	private static final long serialVersionUID = 1L;

	public OrderDetailNotFoundException(String exception_msg) {
		super(exception_msg);
	}
	
}
