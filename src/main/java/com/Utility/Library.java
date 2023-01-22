package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	
	public static void custom_sendKeys(WebElement element,String value,String fieldname) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS, fieldname+"==value succefully send =="+value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}

	}

	public static void custom_Click(WebElement element,String fieldname) {
		
		try {
			element.click();
			test.log(Status.PASS, "clicked succefully == "+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
		
	}
	
	public static void Custom_HandleDropDown(WebElement element,String value) {
		
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
		
		
	}
	
	
	
	
	
	
	
}
