package com.mk.hb.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_details")
public class Employee {

	@Id
	private int emp_id;
	private String emp_name;
	private String contact_Number;

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Employee() {
		super();
	}

	public Employee(int emp_id, String emp_name, String contact_Number) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.contact_Number = contact_Number;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getContact_Number() {
		return contact_Number;
	}

	public void setContact_Number(String contact_Number) {
		this.contact_Number = contact_Number;
	}

}
