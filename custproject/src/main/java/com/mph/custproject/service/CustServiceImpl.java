package com.mph.custproj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mph.custproj.entity.Customer;
import com.mph.custproj.repository.CustRepository;

public class CustServiceImpl implements CustService {
	
	@Autowired
	CustRepository custRepository;
	@Override
	public void createEmployee(Customer employee) {
		custRepository.save(employee);
		
	}

	@Override
	public List<Customer> getAllEmployee() {
		return custRepository.findAll();
	}

	@Override
	public List<Customer> updateEmployee(Customer employee) {
		custRepository.save(employee);
		return getAllEmployee();
	}

	@Override
	public List<Customer> deleteEmployee(long eid) {
		custRepository.deleteById(eid);
		return getAllEmployee();
	}

}
