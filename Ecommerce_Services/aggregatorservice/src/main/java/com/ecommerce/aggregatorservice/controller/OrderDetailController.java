package com.ecommerce.aggregatorservice.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.aggregatorservice.models.OrderDetail;
import com.ecommerce.aggregatorservice.service.OrderDetailService;

/**
 * Order Detail Controller
 * 
 * @author keshavaggarwal
 *
 */
@RequestMapping(value = "/orderdetails")
@RestController
public class OrderDetailController {
	
	@Resource
	OrderDetailService orderDetailService;

	@GetMapping("{userId}")
	public OrderDetail getAllOrderForUser(@PathVariable String userId) 
			throws RuntimeException {
		return orderDetailService.getOrderDetailForUser(userId);
	}
}