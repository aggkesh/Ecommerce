package com.ecommerce.orderservice.controller;

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

import com.ecommerce.orderservice.models.Order;
import com.ecommerce.orderservice.models.OrderDto;
import com.ecommerce.orderservice.service.OrderDetailService;

/**
 * Order Controller
 * 
 * @author keshavaggarwal
 *
 */
@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderDetailService orderDetailService;
	
	@GetMapping
	public List<OrderDto> getOrders() {
		return orderDetailService.getOrders();
	}
	
	@GetMapping("{userId}")
	public List<OrderDto> getOrderByUserId(@PathVariable String userId) {
		return orderDetailService.getOrderForUserId(userId);
	}
	
    @PostMapping
    public void addUser(@RequestBody Order order) {
    	orderDetailService.addOrder(order);
    }

    @PutMapping("{orderId}")
    public void updateUser(@PathVariable String orderId, @RequestBody OrderDto orderDto) {
    	orderDetailService.updateOrder(orderId, orderDto);
    }

    @DeleteMapping("{orderId}")
    public void deleteUser(@PathVariable String orderId) {
    	orderDetailService.deleteOrder(orderId);
    }
}
