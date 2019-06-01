package com.attra.dataloader.springdataloader.repository;

import org.springframework.data.repository.CrudRepository;

import com.attra.dataloader.springdataloader.entity.Transactions;

public interface TransactionRepository extends CrudRepository<Transactions, Integer> {

}
