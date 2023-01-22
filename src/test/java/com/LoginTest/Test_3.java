package com.LoginTest;

import org.testng.annotations.Test;

import com.Utility.BaseClass;

public class Test_3 extends BaseClass{
	
	@Test
	public void VerifyHomepageTest() {
		
	System.out.println(excel.getStringData_Excel("HomePageModule", 0, 0));
	
	System.out.println(excel.getStringData_Excel("HomePageModule", 0, 1));
	System.out.println(excel.getStringData_Excel("HomePageModule", 0, 2));
	
	}

}
