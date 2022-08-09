package com.learnspring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addAccount() {
		System.out.println(getClass() + " ADDING ACCOUNT TO DB FROM MEMBERSHIPDAO");
	}
	
	public void addSillyMethod() {
		System.out.println(getClass() + " BE SILLY");
	}
}
