package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(schema="Public",name="User")
public class User {
	
	@Id
	@Column(name="User_id")
	int userId;
	@Column(name="User_Name")
	String username;
	@Column(name="email_address")
	String email;
	@Column(name="date_of_birth")
	String password;
	@Column(name="password")
	String dateOfBirth;
	
	public int getUserId() {
		return userId;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
}
