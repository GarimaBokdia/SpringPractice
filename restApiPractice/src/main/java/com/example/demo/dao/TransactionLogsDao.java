package com.example.demo.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionLogsDao {
	long transactionId;
	UserDao user;
	LocationDao address;
	long timestamp;
	TransactionTypes txnType;
	double Amount;
	String ip;

	public TransactionLogsDao(long transactionId, UserDao user, LocationDao address, long timestamp,
			TransactionTypes txnType, double amount, String ip) {
		super();
		this.transactionId = transactionId;
		this.user = user;
		this.address = address;
		this.timestamp = timestamp;
		this.txnType = txnType;
		Amount = amount;
		this.ip = ip;
	}

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
