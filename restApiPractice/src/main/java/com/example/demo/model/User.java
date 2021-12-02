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
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
