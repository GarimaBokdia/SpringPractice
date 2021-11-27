package com.example.demo.model;

import javax.persistence.*;

import com.example.demo.dao.LocationDao;
import com.example.demo.dao.TransactionTypes;
import com.example.demo.dao.UserDao;

@Entity
@Table(schema = "public",name="Location")
public class TransactionLog {
	@Id
	@Column(name="")
	long transactionId;
	
	@OneToOne (targetEntity=User.class)
	UserDao user;
	
	@OneToOne (targetEntity=Location.class)
	LocationDao address;
	
	@Column(name="")
	long timestamp;
	
	@Column(name="")
	TransactionTypes txnType;
	
	@Column(name="")
	double Amount;
	
	@Column(name="")
	String ip;

	public long getTransactionId() {
		return transactionId;
	}

	public UserDao getUser() {
		return user;
	}

	public LocationDao getAddress() {
		return address;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public TransactionTypes getTxnType() {
		return txnType;
	}

	public double getAmount() {
		return Amount;
	}

	public String getIp() {
		return ip;
	}
	
}
