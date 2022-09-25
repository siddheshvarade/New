package com.jpa.service;

import java.util.List;

import com.jpa.dto.OrderRequest;
import com.jpa.dto.OrderResponse;
import com.jpa.entity.Customer;

public interface CustomerService {

	public Customer placeOrder(OrderRequest orderRequest);
	
	public List<Customer> finadALLOrders();
	
	public List<OrderResponse> getJoinInfo();
}
