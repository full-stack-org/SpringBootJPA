package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entity.Customer;
import com.example.demo.request.OrderRequest;
import com.example.demo.response.OrderResponse;

@RestController
@RequestMapping("order/v1")
public class OrderController {

	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/saveOrder")
	public Customer placeOrder(@RequestBody OrderRequest orderRequest) {
		return customerRepository.save(orderRequest.getCustomer());
	}

	@GetMapping("/getAllOrders")
	public List<Customer> findAllOrders() {
		return customerRepository.findAll();
	}

	@GetMapping("/getJoinInformation")
	public List<OrderResponse> getJoinInformation() {
		return customerRepository.getJoinInfo();
	}

}
