package com.example.demo.Repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.TransactionLogsDao;
import com.example.demo.model.TransactionLog;

@Repository
public interface TransactionLogRepository extends JpaRepository<TransactionLog, Integer> {
	

	Logger log = LoggerFactory.getLogger(TransactionLogRepository.class);
	
	
	void saveTransactionLogs(List<TransactionLogsDao> transactionLogs);
	
	void updateTransacionLogs(TransactionLogsDao transactionLog);
	boolean deleteTransactionLogs(TransactionLogsDao transactionLog);
}
