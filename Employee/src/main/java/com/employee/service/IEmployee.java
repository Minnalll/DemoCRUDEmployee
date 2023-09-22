package com.employee.service;

import java.util.List;

import com.employee.model.Employee;


public interface IEmployee {
	
	Employee getOne(Long id);
	List<Employee> getAll();
	Employee create (Employee empl);
	Employee update(Long id, Employee empl);
	String delete(Long id);

}
