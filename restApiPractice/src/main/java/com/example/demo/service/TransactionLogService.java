package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TransactionLogRepository;
import com.example.demo.dao.TransactionLogsDao;
import com.example.demo.model.TransactionLog;


@Service
public class TransactionLogService {
	
	@Autowired
	TransactionLogRepository transactionLogRepository;

	public void saveTransactionLogs(List<TransactionLog> transactionLogs) {
		for(TransactionLog transDao : transactionLogs) {
			transactionLogRepository.save(transDao);
		}
	}

	public List<TransactionLogService> fetchTransactionLogs(int userId,int locId){
		return null;
		
	}
	public void updateTransacionLogs(TransactionLog transactionLog) {
		
	}
	public boolean deleteTransactionLogs(TransactionLog transactionLog) {
		return false;
		
	}
}
