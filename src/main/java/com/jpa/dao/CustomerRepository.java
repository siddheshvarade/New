package com.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpa.dto.OrderResponse;
import com.jpa.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query("select new com.jpa.dto.OrderResponse(c.name, p.productName) from Customer c join c.products p")
	public List<OrderResponse> getJoinInfo();
	
}
