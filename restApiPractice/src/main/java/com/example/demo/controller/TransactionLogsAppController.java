package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TransactionLogsDao;
import com.example.demo.model.TransactionLog;
import com.example.demo.service.TransactionLogService;



@RestController
@RequestMapping("/transactions")
public class TransactionLogsAppController {

	@Autowired
	TransactionLogService transactionLogService;
	
	@PostMapping(value="/saveLogs")
	void saveTransactionLogs(@RequestBody List<TransactionLog> transactionLogs) {
		transactionLogService.saveTransactionLogs(transactionLogs);
	}
	
	@GetMapping(value="/getLogs")
	List<TransactionLogService> fetchTransactionLogs(@RequestBody int userId,@RequestBody int locId){		
		return transactionLogService.fetchTransactionLogs(userId, locId);
	}
	

	@PutMapping(value="/updateLogs")
	void updateTransacionLogs(@RequestBody TransactionLog transactionLog) {
		transactionLogService.updateTransacionLogs(transactionLog);
	}
	
	@PutMapping(value="/resetLogs")
	boolean deleteTransactionLogs(@RequestBody TransactionLog transactionLog) {
		return transactionLogService.deleteTransactionLogs(transactionLog);
	}
	
}
