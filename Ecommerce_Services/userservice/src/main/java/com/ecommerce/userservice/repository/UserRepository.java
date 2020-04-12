package com.ecommerce.userservice.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.userservice.models.User;

/**
 * User Repository for user db query
 * 
 * @author keshavaggarwal
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, String>{
}
