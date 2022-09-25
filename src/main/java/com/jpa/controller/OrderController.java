package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.dao.CustomerRepository;
import com.jpa.dao.ProductRepository;
import com.jpa.dto.OrderRequest;
import com.jpa.dto.OrderResponse;
import com.jpa.entity.Customer;
import com.jpa.service.CustomerService;

@RestController
public class OrderController {

	//sdjlsdssdljsj
    @Autowired
	private CustomerService customerService;
	
	@PostMapping("/placeorder")
	public Customer placeOrder(@RequestBody OrderRequest orderRequest) {
		
		return customerService.placeOrder(orderRequest);
	}
	
	@GetMapping("/findallorders")
	public List<Customer> findAllOrders(){
		return customerService.finadALLOrders();
	}
	
	@GetMapping("/getinfo")
	public List<OrderResponse>getJoinInfo(){
		
		return customerService.getJoinInfo();
	}
}
