package com.ecommerce.orderservice.models;

/**
 * Order Dto Model
 * 
 * @author keshavaggarwal
 *
 */
public class OrderDto {
	private String orderId;
	private String orderAmount;
	private String orderDate;
	
	public OrderDto(String orderId, String orderAmount, String orderDate) {
		this.setOrderId(orderId);
		this.setOrderAmount(orderAmount);
		this.setOrderDate(orderDate);
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
}