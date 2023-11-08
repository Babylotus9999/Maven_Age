package com.age_external;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Age_test {
	
	@Test
	public void test1(){
		int age1=18;
		Age_caliculator l = new Age_caliculator();
		Assert.assertEquals(1, l.validatevoteAge(age1));
	}
	
	@Test
	public void test2(){
		int age2=5;
		Age_caliculator l = new Age_caliculator();
		Assert.assertEquals(1, l.validatevoteAge(age2));
	}
	
	@Test
	public void test3(){
		int age3=105;
		Age_caliculator l = new Age_caliculator();
		Assert.assertEquals(1, l.validatevoteAge(age3));
	}
	
	@Test
	public void test4(){
		int age4=60;
		Age_caliculator l = new Age_caliculator();
		Assert.assertEquals(1, l.validatevoteAge(age4));
	}

}
