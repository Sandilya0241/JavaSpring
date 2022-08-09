package com.learnspring.aop3.before.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public boolean addAccount() {
		System.out.println(getClass() + " ADDING ACCOUNT TO DB FROM MEMBERSHIPDAO");
		return false;
	}
	
	public void addSillyMethod() {
		System.out.println(getClass() + " BE SILLY");
	}
}
