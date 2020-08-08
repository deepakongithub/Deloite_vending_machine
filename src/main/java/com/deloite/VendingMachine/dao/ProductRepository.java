package com.deloite.VendingMachine.dao;

import org.springframework.data.repository.CrudRepository;

import com.deloite.VendingMachine.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}