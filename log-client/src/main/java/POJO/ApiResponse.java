package POJO;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {
	int page;
	int per_page;
	int total;
	int total_pages;
	@JsonProperty("data") TransactionLog[] transactionLog;
	
	public int getPage() {
		return page;
	}
	public int getPer_page() {
		return per_page;
	}
	public int getTotal() {
		return total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public TransactionLog[] getTransactionLog() {
		return transactionLog;
	}
	public void setTransactionLog(TransactionLog[] transactionLog) {
		this.transactionLog = transactionLog;
	}
	@Override
	public String toString() {
		return "ApiResponse [page=" + page + ", per_page=" + per_page + ", total=" + total + ", total_pages="
				+ total_pages + ", transactionLog=" + Arrays.toString(transactionLog) + "]";
	}
	
	
	

}
