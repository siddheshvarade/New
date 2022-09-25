package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dao.CustomerRepository;
import com.jpa.dto.OrderRequest;
import com.jpa.dto.OrderResponse;
import com.jpa.entity.Customer;

@Service
public class CustomerServiceImpl  implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public Customer placeOrder(OrderRequest orderRequest) {
		return customerRepository.save(orderRequest.getCustomer());
		
	}


	@Override
	public List<Customer> finadALLOrders() {
		return customerRepository.findAll();
	}


	@Override
	public List<OrderResponse> getJoinInfo() {
		
		return customerRepository.getJoinInfo();
	}

}
