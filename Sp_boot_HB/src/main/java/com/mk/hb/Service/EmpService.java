package com.mk.hb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.hb.EmpRepository.EmpRepository;
import com.mk.hb.pojo.Employee;

@Service
public class EmpService {
	@Autowired
	EmpRepository repo;

	public Employee save(Employee emp) {

		return repo.save(emp);
	}

	public Employee findById(int id) {
		
		Employee dbEmp=repo.getOne(id);
		return dbEmp;
	}
	 

}
