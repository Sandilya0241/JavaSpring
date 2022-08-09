package com.learnspring.aop.dao;

import org.springframework.stereotype.Component;

import com.learnspring.aop.Account;

@Component
public class AccountDAO {
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + " ADDING ACCOUNT TO DB FROM ACCOUNTDAO");
	} 
}
