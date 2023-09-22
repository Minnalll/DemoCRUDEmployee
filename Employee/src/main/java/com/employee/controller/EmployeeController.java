package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeServiceIMPL;
import com.employee.service.IEmployee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private IEmployee empSer; 
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> getOne(@PathVariable long id){
		Employee one = empSer.getOne(id);
		return new ResponseEntity<Employee> (one,HttpStatus.OK);	
	}
	
	@GetMapping("/find")
	public ResponseEntity<List<Employee>> getAll(){
		List<Employee> all = empSer.getAll();
		return new ResponseEntity<List<Employee>> (all,HttpStatus.OK);	
	}
	
	@PostMapping("create")
	public ResponseEntity<Employee> create(@RequestBody Employee empl){
		Employee create = empSer.create(empl);
		return new ResponseEntity<Employee> (create, HttpStatus.CREATED);		
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody Employee empl){
		Employee create = empSer.update(id,empl);
		return new ResponseEntity<Employee> (create, HttpStatus.CREATED);		
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> update(@PathVariable Long id){
		String create = empSer.delete(id);
		return new ResponseEntity<String> (create, HttpStatus.OK);		
	}
	
	

}
