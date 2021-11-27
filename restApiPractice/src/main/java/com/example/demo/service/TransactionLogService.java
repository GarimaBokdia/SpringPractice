package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.TransactionLogsDao;

@Service
public interface TransactionLogService{

	void saveTransactionLogs(List<TransactionLogsDao> transactionLogs);
	List<TransactionLogService> fetchTransactionLogs(int userId,int locId);
	void updateTransacionLogs(TransactionLogsDao transactionLog);
	boolean deleteTransactionLogs(TransactionLogsDao transactionLog);
}
