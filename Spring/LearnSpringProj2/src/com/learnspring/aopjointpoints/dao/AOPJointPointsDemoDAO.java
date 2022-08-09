package com.learnspring.aopjointpoints.dao;

import org.springframework.stereotype.Component;

import com.learnspring.aopjointpoints.Account;

@Component
public class AOPJointPointsDemoDAO {
	
	private String name;
	private String serviceCode;
	
	public String getName() {
		System.out.println("AOPJointPointsDemoDAO ... inside getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println("AOPJointPointsDemoDAO ... inside setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println("AOPJointPointsDemoDAO ... inside getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println("AOPJointPointsDemoDAO ... inside setServiceCode()");
		this.serviceCode = serviceCode;
	}

	public void addAccount(Account account, boolean vipFlag) {
		System.out.println("Add Account JOINPOINT DAO");
	}
}
