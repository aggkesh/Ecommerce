package com.ecommerce.aggregatorservice.service.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.aggregatorservice.exception.OrderDetailNotFoundException;
import com.ecommerce.aggregatorservice.models.OrderDetail;
import com.ecommerce.aggregatorservice.service.OrderDetailService;

/**
 * Order Detail Service Implementation to interact with order & user api
 * 
 * @author keshavaggarwal
 *
 */
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Resource(name = "restTemp")
	private RestTemplate restTemplate;

	@Value("${QUOTES_USER_URL:http://localhost:8080}")
	private String usersUrl;
	
	@Value("${QUOTES_ORDER_URL:http://localhost:8081}")
	private String ordersUrl;
	
	@Override
	public OrderDetail getOrderDetailForUser(String userId) throws RuntimeException {

		Object userDetails = getUserDetail(userId);
		List<Object> orders = getOrdersForUserId(userId);
		
		return new OrderDetail(userDetails, orders);				
	}

	public List<Object> getOrdersForUserId(String userId) throws RuntimeException {
		String url = ordersUrl + "/orders/" + userId;

		try {
			ResponseEntity<Object[]> ordersResponse = restTemplate.getForEntity(url, Object[].class);
			
			return Arrays.asList(ordersResponse.getBody());		
		} catch(Exception e) {
			throw new OrderDetailNotFoundException("Error fetching orders for given userId " + userId);
		}
	}

	private Object getUserDetail(String userId) throws RuntimeException {
		String url = usersUrl + "/users/" + userId;
		
		try {
			ResponseEntity<Object> userResponse = restTemplate.getForEntity(url, Object.class);

			return userResponse.getBody();
		}catch(Exception e) {
			throw new OrderDetailNotFoundException("Error fetching user for given userId " + userId);
		}
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
}
