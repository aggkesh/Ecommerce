package com.ecommerce.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.orderservice.models.Order;

/**
 * Order Repository for order db query
 * 
 * @author keshavaggarwal
 *
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, String>{
}
