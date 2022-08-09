package com.learnspring3.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IFSCCodeConstraintValidator implements ConstraintValidator<IFSCCode, String>{

	private String IFSCCodePrefix;
	
	@Override
	public void initialize(IFSCCode theCourseCode) {
		IFSCCodePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result ;
		if (theCode != null) {
			result = theCode.startsWith(IFSCCodePrefix);
		} else {
			result = true; 
		}
		return result;
	}

}
