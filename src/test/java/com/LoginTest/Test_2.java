package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PomPages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_2 extends BaseClass{

	
	@Test
	public void verify_loginTestValid() {
		
		
		
		// Element identify 
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_sendKeys(login.gettxt_email(), "Bug@gmail.com" ,"Email Id ");
		Library.custom_sendKeys(login.gettxt_password(), "123dfsg" ,"Password");
		Library.custom_Click(login.getbtn_login() ,"Lgin Button");
		
		
	}
}
