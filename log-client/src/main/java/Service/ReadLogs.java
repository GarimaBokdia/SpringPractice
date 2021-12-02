package Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.ApiResponse;
import POJO.TransactionLog;

public class ReadLogs {

	public static void main(String[] args) {
		 try {

				URL url = new URL("https://jsonmock.hackerrank.com/api/transactions/");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");

				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}

				BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

				String output;
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					//System.out.println(output.length());
					//System.out.println(output);
					 ObjectMapper objectMapper = new ObjectMapper();
					
					 ApiResponse page = objectMapper.readValue(output, ApiResponse.class);
					
					 Map<Integer,Double> AmountByUser = new HashMap<Integer,Double>();
					 Map<Integer,Double> AmountByLocation = new HashMap<Integer,Double>();
					 mergeTransactionsByUserId(page,AmountByUser);
					 mergeTransactionsByLocId(page,AmountByLocation);
				}

				conn.disconnect();

			  } catch (MalformedURLException e) {

				e.printStackTrace();

			  } catch (IOException e) {

				e.printStackTrace();

			  }
	}

	private static void mergeTransactionsByUserId(ApiResponse page, Map<Integer, Double> logsByUser) {
		TransactionLog[] lstTransactionLogs = page.getTransactionLog();
		for(TransactionLog log : lstTransactionLogs) {
			double amount = Double.parseDouble(log.getAmount().substring(1).replace(",",""));
			if(log.getTxnType().equalsIgnoreCase("Credit")) {
				amount = amount*-1;
			}
			if(!logsByUser.containsKey(log.getUserId())) {
				logsByUser.put(log.getUserId(), amount);
			}
			else {
				logsByUser.put(log.getUserId(), logsByUser.get(log.getUserId())+amount);
			}
			
			
		}
		System.out.println("***************************************");
		System.out.println(logsByUser);
		System.out.println("***************************************");
	}

	private static void  mergeTransactionsByLocId(ApiResponse page, Map<Integer, Double> logsByLocation) {
		TransactionLog[] lstTransactionLogs = page.getTransactionLog();
		for(TransactionLog log : lstTransactionLogs) {			
			
			double amount = Double.parseDouble(log.getAmount().substring(1).replace(",",""));
			if(log.getTxnType().equalsIgnoreCase("Credit")) {
				amount = amount*-1;
			}
			if(!logsByLocation.containsKey(log.getLocation().getId())) {
				logsByLocation.put(log.getLocation().getId(), amount);
			}
			else {
				logsByLocation.put(log.getLocation().getId(), logsByLocation.get(log.getLocation().getId())+amount);
			}
			
		}
		
		
		System.out.println("#######################################");
		System.out.println(logsByLocation);
		System.out.println("#######################################");
	}


}
