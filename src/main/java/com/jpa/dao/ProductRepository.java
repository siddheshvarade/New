package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
