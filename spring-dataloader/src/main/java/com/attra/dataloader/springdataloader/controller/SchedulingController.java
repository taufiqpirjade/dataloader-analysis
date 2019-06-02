package com.attra.dataloader.springdataloader.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.attra.dataloader.springdataloader.repository.TransactionRepository;

@Controller
public class SchedulingController {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	private final static Logger logger = LoggerFactory.getLogger(SchedulingController.class);
	int i =0;
	
	@PostMapping("/getmcgcount")
	public @ResponseBody ResponseEntity<Map<String, LinkedList<String>>> executeGetCount() {
		LinkedList<String> mcgList = new LinkedList<String>();
		LinkedList<String> countList = new LinkedList<String>();
		List<Map<String,String>> transactionList = transactionRepository.getDataByMCG();
		for (Map<String,String> entry:transactionList) {
			mcgList.add(entry.get("mcg"));
			countList.add(entry.get("count"));
		}
		Map<String,LinkedList<String>> mapofMcg = new HashMap<String, LinkedList<String>>();
		mapofMcg.put("MCG", mcgList);
		mapofMcg.put("count", countList);
		return ResponseEntity.ok(mapofMcg);
	}
	
	@PostMapping("/gettransactiondatecount")
	public @ResponseBody ResponseEntity<Map> executeGetCount1() {
		LinkedList<Map> data = new LinkedList();
		LinkedList<String> mcgList = new LinkedList<String>();
		Map<String, int[]> dataList = new HashMap<>();
		Map<String, Set<String>> date = new HashMap<>();
		LinkedList<String> countList = new LinkedList<String>();
		LinkedList<String> dateList = new LinkedList<String>();
		List<Map<String,String>> transactionList = transactionRepository.getDataByTransactionMCG();
		for (Map<String,String> entry:transactionList) {
			if(!dateList.contains(entry.get("date"))) {
				dateList.add(entry.get("date"));
			}
		}
		Collections.sort(dateList);
		for (Map<String,String> entry:transactionList) {
			if(dataList.containsKey(entry.get("mcg"))) {
				int[] value = dataList.get(entry.get("mcg"));
				int index = dateList.indexOf(entry.get("date"));
				value[index] = Integer.parseInt(entry.get("count"));
				dataList.put(entry.get("mcg"), value);
			}else {
				int[] value = new int[dateList.size()];
				int index = dateList.indexOf(entry.get("date"));
				value[index] = Integer.parseInt(entry.get("count"));
				mcgList.add(entry.get("mcg"));
				dataList.put(entry.get("mcg"), value);
			}
		}
		Iterator<String> keys = dataList.keySet().iterator();
		while(keys.hasNext()) {
			String label = keys.next();
			Map value = new HashMap<>();
			value.put("label", label);
			value.put("data", dataList.get(label));
			data.add(value);
		}
		Map result = new HashMap();
		result.put("data", data);
		result.put("labels", dateList);
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/region")
	public @ResponseBody ResponseEntity<Map<String, LinkedList<String>>> executeBaseonRegion() {
		LinkedList<String> mcgList = new LinkedList<String>();
		LinkedList<String> countList = new LinkedList<String>();
		List<Map<String,String>> transactionList = transactionRepository.getDataByRegion();
		for (Map<String,String> entry:transactionList) {
			mcgList.add(entry.get("city"));
			countList.add(entry.get("count"));
		}
		Map<String,LinkedList<String>> mapofMcg = new HashMap<String, LinkedList<String>>();
		mapofMcg.put("city", mcgList);
		mapofMcg.put("count", countList);
		return ResponseEntity.ok(mapofMcg);
	}
	
	//@Scheduled(fixedDelay=5000)
	public void getTransactionDataForFormatting() {
		logger.info("Batch running started");
		/*if (i<4) {
			Transactions transactions = new Transactions();
			transactions.setAcquirerBankCode("SBI");
			transactions.setAcquirerId("2344");
			transactions.setCardType("EMV"); //EMV //MAGNATIC STRIPE
			transactions.setDeviceTypeIndicator("API");
			transactions.setInterchangeFees(5);
			transactions.setIssuerBankCode("HDFC BANK");
			transactions.setMcc("1234");
			transactions.setMcg("GoIbibo Group");
			transactions.setMerchantCity("MUMBAI");
			transactions.setMerchantCountry("INDIA");
			transactions.setMerchantState("MH");
			transactions.setMerchantZipCode("410006");
			transactions.setNetworkCode("VISA");
			transactions.setOutletNumber("523234");
			transactions.setProcessingCode("PURCHASE");
			transactions.setProductType("Credit");
			transactions.setServiceTax(2);
			transactions.setSurchargeBillingAmount(1);
			transactions.setTerminalId("2344");
			transactions.setTerminalType("API");
			transactions.setTransactionAmount((int) Math.random());
			transactions.setTransactionCurrency("INR");
			
			transactionRepository.save(transactions);
			i++;
		}*/
		
		//transactionRepository.findAll();
	}
}
