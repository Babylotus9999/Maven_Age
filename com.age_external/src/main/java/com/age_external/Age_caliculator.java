package com.age_external;

import java.util.ResourceBundle;

public class Age_caliculator {
	
	public int validatevoteAge(int age) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		
		if(age<0 || age>100) {
			return 0; //Invalid age
		}
		else if(age>=18) {
			return 1; //valid for the VOTE
		}
		else {
			return 0; //Not valid for the vote
		}
	}
		
}