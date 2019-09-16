package com.mk.hb.EmpRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mk.hb.pojo.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
