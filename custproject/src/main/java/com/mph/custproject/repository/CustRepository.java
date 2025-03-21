package com.mph.custproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mph.custproj.entity.Customer;

@Repository
public interface CustRepository extends JpaRepository<Customer, Long>{
	public Customer findByEname(String ename);
}
