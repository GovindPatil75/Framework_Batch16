package com.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PomPages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 extends BaseClass{
	
	
	@Test
	public void verify_loginTest() {
		
		
		// Element identify 
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_sendKeys(login.gettxt_email(), excel.getStringData_Excel("LoginModule", 0, 0),"Email Id");
		Library.custom_sendKeys(login.gettxt_password(), excel.getStringData_Excel("LoginModule", 0, 1),"Password");
		Library.custom_Click(login.getbtn_login(),"Login Button");
		
		
		
		//Browser Close
		
		
	}

}
