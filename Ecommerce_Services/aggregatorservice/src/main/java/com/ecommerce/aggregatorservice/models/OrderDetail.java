package com.ecommerce.aggregatorservice.models;

import java.util.List;

import org.springframework.lang.NonNull;

/**
 * Order Detail Model
 * 
 * @author keshavaggarwal
 *
 */
public class OrderDetail {
	@NonNull
	private Object userDetails;
	@NonNull
	private List<Object> orders;
	
	public OrderDetail(@NonNull Object userDetails, @NonNull List<Object> orders) {
		this.userDetails = userDetails;
		this.orders = orders;
	}

	@NonNull
	public Object getUserDetails() {
		return userDetails;
	}
	
	public void setUserDetails(@NonNull Object userDetails) {
		this.userDetails = userDetails;
	}
	
	@NonNull
	public List<Object> getOrders() {
		return orders;
	}
	
	public void setOrders(@NonNull List<Object> orders) {
		this.orders = orders;
	}
	
	
}
