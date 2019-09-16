package com.mk.hb.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mk.hb.Service.EmpService;
import com.mk.hb.pojo.Employee;

@RestController
public class EmployeeController {
	@Autowired
	EmpService service;

	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee emp) {

		Employee res_employee = service.save(emp);

		return new ResponseEntity<Employee>(HttpStatus.CREATED);

	}

}
