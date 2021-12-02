package com.practise.employeeManagementGarima.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.employeeManagementGarima.model.Employee;
import com.practise.employeeManagementGarima.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}
	

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAllByOrderByFirstnameAsc();
	}


	
	
	
	

}
