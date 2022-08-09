package com.learnspring.aop2.dao;

import org.springframework.stereotype.Component;

import com.learnspring.aop2.Account;

@Component
public class AccountDAO {
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + " ADDING ACCOUNT TO DB FROM ACCOUNTDAO");
	}
	
	public void method2() {
		System.out.println(getClass() + " method2() method FROM ACCOUNTDAO");
	}
}
