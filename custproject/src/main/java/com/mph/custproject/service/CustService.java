package com.mph.custproj.service;

import java.util.List;


import com.mph.custproj.entity.Customer;


public interface CustService {
	public void createEmployee(Customer employee);
	public List<Customer> getAllEmployee() ;
	public List<Customer> updateEmployee(Customer employee);
	public List<Customer> deleteEmployee(long eid);
	
}
