package com.example.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankapp.model.Transactions;
import java.util.List;



public interface TransactionRepository extends JpaRepository<Transactions, Long>{
	
	List<Transactions> findByAccountId(Long accountId);
	
}
