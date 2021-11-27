package com.example.demo.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionLogDummy {
	long id;
	String userId;
	String userName;	
	long timestamp;
	String txnType;
	double Amount;	
	String ip;
	public long getId() {
		return id;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public String getTxnType() {
		return txnType;
	}
	public double getAmount() {
		return Amount;
	}
	public String getIp() {
		return ip;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@Override
	public String toString() {
		return "TransactionLogDummy [id=" + id + ", userId=" + userId + ", userName=" + userName + ", timestamp="
				+ timestamp + ", txnType=" + txnType + ", Amount=" + Amount + ", ip=" + ip + "]";
	}
	
	
}
