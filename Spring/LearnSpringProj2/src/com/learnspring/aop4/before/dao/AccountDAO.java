package com.learnspring.aop4.before.dao;

import org.springframework.stereotype.Component;

import com.learnspring.aop4.before.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	public String getName() {
		System.out.println(getClass() + " inside getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + " inside setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + " inside getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " inside setServiceCode()");
		this.serviceCode = serviceCode;
	}

	
	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + " ADDING ACCOUNT TO DB FROM ACCOUNTDAO");
	}
	
	public void method2() {
		System.out.println(getClass() + " method2() method FROM ACCOUNTDAO");
	}
}
