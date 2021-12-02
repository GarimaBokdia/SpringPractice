package com.practise.employeeManagementGarima.model;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="employeeregistration")
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="dateofbirth")
	private Date dateofbirth;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="department")
	private String department;

	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public Employee(String firstname, String lastname, Date dateofbirth, String gender, String department) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.gender = gender;
		this.department = department;
	}

	
	
	
	

}
