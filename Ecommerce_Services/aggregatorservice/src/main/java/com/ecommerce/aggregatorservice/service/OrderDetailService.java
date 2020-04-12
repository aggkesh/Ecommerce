package com.ecommerce.aggregatorservice.service;

import com.ecommerce.aggregatorservice.models.OrderDetail;

/**
 * Order Detail Service interact with order & user api
 * 
 * @author keshavaggarwal
 *
 */
public interface OrderDetailService {

	/**
	 * Order Detail for User with given userId
	 * 
	 * @param userId for which to get order detail 
	 * @return Order Detail contains user Detail and orders for User with userId 
	 * @throws RuntimeException throws exception no orderDetail present for 
	 * given user with userId
	 */
	public OrderDetail getOrderDetailForUser(String userId) throws RuntimeException;
}
