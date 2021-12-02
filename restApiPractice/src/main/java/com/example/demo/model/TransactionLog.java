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

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public void setUser(UserDao user) {
		this.user = user;
	}

	public void setAddress(LocationDao address) {
		this.address = address;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public void setTxnType(TransactionTypes txnType) {
		this.txnType = txnType;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
