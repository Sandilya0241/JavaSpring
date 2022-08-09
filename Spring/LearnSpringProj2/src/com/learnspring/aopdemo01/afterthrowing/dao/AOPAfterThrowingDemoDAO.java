package com.learnspring.aopdemo01.afterthrowing.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learnspring.aopdemo01.afterthrowing.Account;

@Component
public class AOPAfterThrowingDemoDAO {
	private String accountName;
	private String accountNumber;
	
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public List<Account> findAccounts(boolean tripWire) {
		
		if(tripWire) {
			throw new RuntimeException("No soup for you!!!");
		}
		
		List<Account> listOfAccounts = new ArrayList<Account>();
		listOfAccounts.add(new Account("Sandy", "Platinum"));
		listOfAccounts.add(new Account("Mark", "Gold"));
		listOfAccounts.add(new Account("Eric", "Silver"));
		
		return listOfAccounts;
	}
	
	public void addAccount() {
		System.out.println("ADD ACCOUNT DAO Method");
	}
	
}
