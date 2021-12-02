package POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionLog {
	@JsonProperty("id") int id;
	int userId;
	String userName;
	long timestamp;
	String txnType;
	String amount;
	Location location;
	String ip;
	public int getId() {
		return id;
	}
	public int getUserId() {
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
	public String getAmount() {
		return amount;
	}
	public Location getLocation() {
		return location;
	}
	public String getIp() {
		return ip;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserId(int userId) {
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
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@Override
	public String toString() {
		return "TransactionLog [id=" + id + ", userId=" + userId + ", userName=" + userName + ", timestamp=" + timestamp
				+ ", txnType=" + txnType + ", amount=" + amount + ", location=" + location + ", ip=" + ip + "]";
	}
}
