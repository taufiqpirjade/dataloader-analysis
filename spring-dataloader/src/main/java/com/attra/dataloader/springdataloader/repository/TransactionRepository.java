package com.attra.dataloader.springdataloader.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.attra.dataloader.springdataloader.entity.Transactions;

public interface TransactionRepository extends CrudRepository<Transactions, Integer> {
	
	
	@Query(value="select a.mcg as mcg, count(*) as count from Transactions a group by a.mcg")
	List<Map<String,String>> getDataByMCG();
	
	@Query(value="select a.mcg as mcg, count(*) as count, a.transactionDate as date from Transactions a group by a.mcg, a.transactionDate ORDER BY a.mcg ASC")
	List<Map<String,String>> getDataByTransactionMCG();
	
	@Query(value="select a.merchantCity as city, count(*) as count from Transactions a group by a.merchantCity")
	List<Map<String,String>> getDataByRegion();
}
