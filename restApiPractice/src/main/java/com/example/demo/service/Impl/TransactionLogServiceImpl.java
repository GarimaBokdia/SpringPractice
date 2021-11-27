package com.example.demo.service.Impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.TransactionLogsDao;
import com.example.demo.service.TransactionLogService;

@Repository
public class TransactionLogServiceImpl {
	Logger log = LoggerFactory.getLogger(TransactionLogServiceImpl.class);
	NamedParameterJdbcTemplate template;  
	
	void saveTransactionLogs(List<TransactionLogsDao> transactionLogs) {
		
		
		
		//if(transactionLogs!=null) 
		{
			log.info("here");
			 final String sql = "insert into Location(location_id, address , zipcode,city) values(:locationId,:address,:zipcode,:city)";

		        KeyHolder holder = new GeneratedKeyHolder();
		        SqlParameterSource param = new MapSqlParameterSource()
		.addValue("locationId", 1)
		.addValue("address", "ashok vihar")
		.addValue("zipcode", "313004")
		.addValue("city", "udaipur");
		  template.update(sql,param, holder);
		}
	}
	List<TransactionLogService> fetchTransactionLogs(int userId,int locId){
		return null;
		
	}
	void updateTransacionLogs(TransactionLogsDao transactionLog) {
		
	}
	boolean deleteTransactionLogs(TransactionLogsDao transactionLog) {
		return false;
		
	}
}
