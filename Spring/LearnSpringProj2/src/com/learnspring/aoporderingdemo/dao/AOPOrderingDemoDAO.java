package com.learnspring.aoporderingdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AOPOrderingDemoDAO {

	private String name;
	private String serviceCode;
	
	public String getName() {
		System.out.println("Inside AOPOrderingDemoDAO.getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside AOPOrderingDemoDAO.setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println("Inside AOPOrderingDemoDAO.getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println("Inside AOPOrderingDemoDAO.setServiceCode()");
		this.serviceCode = serviceCode;
	}

	public void addAccount() {
		System.out.println("ADD ACCOUNT FROM AOPORDERINGDEMO DAO");
	}
}
