package com.learnspring3.mvcmodule4;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.learnspring3.mvc.validation.AccountCode;
import com.learnspring3.mvc.validation.IFSCCode;

public class Customer {
	private String firstName;
	
	@NotNull(message = "Last name is mandatory")
	@Size(min = 1, message = "Last name cannot be empty")
	private String lastName;
	
	@NotNull(message = "Value is mandatory")
	@Min(value = 1, message = "Value must be greater than 0")
	@Max(value = 5, message = "Value should be less than 5")
	private Integer ticketsCount;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters/ digits value is allowed")
	@NotNull(message = "Postal code cannot be empty.")
	private String postalCode;
	
	@NotNull(message="IFSC code cannot be null")
	@IFSCCode(value = "HDFC", message="IFSC code should start with HDFC")
	private String strIFSCCode;
	
	@NotNull(message="Account code cannot be null")
	@AccountCode
	private String accountCode;

	public Customer() {	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getTicketsCount() {
		return ticketsCount;
	}

	public void setTicketsCount(Integer ticketsCount) {
		this.ticketsCount = ticketsCount;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getStrIFSCCode() {
		return strIFSCCode;
	}

	public void setStrIFSCCode(String strIFSCCode) {
		this.strIFSCCode = strIFSCCode;
	}
	
	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
}
