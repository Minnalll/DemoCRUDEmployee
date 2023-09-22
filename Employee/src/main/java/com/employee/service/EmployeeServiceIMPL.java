package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeRepo;
import com.employee.model.Employee;
@Service
public class EmployeeServiceIMPL implements IEmployee{
	@Autowired
	private EmployeeRepo repo;

	@Override
	public Employee getOne(Long id) {
		Employee employee = repo.findById(id).get();
		return employee;
	}

	@Override
	public List<Employee> getAll() {
		return repo.findAll();
	}

	@Override
	public Employee create(Employee empl) {
		Employee createdEmpl = repo.save(empl);
		return createdEmpl;
	}

	@Override
	public Employee update(Long id, Employee empl) {
		Employee updatedEmpl = null;
		Employee one = getOne(id);
		if (one != null) {
			updatedEmpl = repo.save(empl);			
		}
		return updatedEmpl;
	}

	@Override
	public String delete(Long id) {
		Employee deletedEmpl = null;
		Employee one = getOne(id);
		if (one != null) {
			repo.deleteById(id);		
		}
		return "Employee with ID : " + id + " is Deleted.";
	}

}
