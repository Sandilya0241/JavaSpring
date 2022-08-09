package com.learnspring.aopdemo.after.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learnspring.aopdemo.after.Account;

@Component
public class AOPAfterDemoDAO {
	private String accountNumber;
	private String accountName;
	
	
	
	public String getAccountNumber() {
		System.out.println("Inside AOPAfterDemoDAO.getAccountNumber()");
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		System.out.println("Inside AOPAfterDemoDAO.setAccountNumber()");
		this.accountNumber = accountNumber;
	}



	public String getAccountName() {
		System.out.println("Inside AOPAfterDemoDAO.getAccountName()");
		return accountName;
	}



	public void setAccountName(String accountName) {
		System.out.println("Inside AOPAfterDemoDAO.setAccountName()");
		this.accountName = accountName;
	}

	
	
	public List<Account> findAccounts() {
		List<Account> myAccountList = new ArrayList<Account>();
		
		myAccountList.add(new Account("Sandilya", "Platinum"));
		myAccountList.add(new Account("Luka", "Gold"));
		myAccountList.add(new Account("Bret", "Silver"));
		
		return myAccountList;
	}
	
	

	public void addAccount() {
		System.out.println(getClass() + " @ After AOP DEMO DAO class addAccount()");
	}	
}
