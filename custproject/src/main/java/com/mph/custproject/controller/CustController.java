package com.mph.custproj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.custproj.entity.Customer;
import com.mph.custproj.service.CustService;

@RestController
@RequestMapping("/demosprboot/semployee")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders = "*")
public class CustController {

	@Autowired
	CustService custService;

	@PostMapping("/addemp")
	public ResponseEntity<?> addEmployee(@RequestBody Customer employee) {
		custService.createEmployee(employee);
		return new ResponseEntity<>(employee,HttpStatus.CREATED);

	}

	@GetMapping("/listallemp")
	public ResponseEntity<List<Customer>> getAllEmployee() {
		List<Customer> emplist=custService.getAllEmployee();
		return ResponseEntity.ok(emplist);
	}

	@PutMapping("/updateemp")
	public ResponseEntity<List<Customer>> updateEmployee(@RequestBody Customer employee) {
		List<Customer> updateEmp=custService.updateEmployee(employee);
		return ResponseEntity.ok(updateEmp);
	}

	@DeleteMapping("/deletebyid/{eid}")
	public ResponseEntity<List<Customer>> deleteEmployee(@PathVariable long eid) {
		List<Customer> deleteEmp=custService.deleteEmployee(eid);
		return ResponseEntity.ok(deleteEmp);
	}

	

}
