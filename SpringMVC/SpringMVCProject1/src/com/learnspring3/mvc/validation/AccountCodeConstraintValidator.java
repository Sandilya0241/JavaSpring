package com.learnspring3.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AccountCodeConstraintValidator implements ConstraintValidator<AccountCode, String>{

	private String[] accountCodePrefix;
	
	@Override
	public void initialize(AccountCode theAccountCode) {
		accountCodePrefix = theAccountCode.value();
	}
	
	@Override
	public boolean isValid(String code, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result = false;
		
		if(code != null) {
			for (String accountPrefix : accountCodePrefix) {
				result = code.startsWith(accountPrefix);
				if(result) {
					break;
				}
			}
		} else {
			result = true;
		}
		return result;
	}
}
