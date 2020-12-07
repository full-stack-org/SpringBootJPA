package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Customer;
import com.example.demo.response.OrderResponse;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	@Query("SELECT new com.example.demo.response.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInfo();

}
