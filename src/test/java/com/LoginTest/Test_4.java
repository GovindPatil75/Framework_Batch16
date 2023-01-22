package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PomPages.Login1Pom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_4 extends BaseClass{
	
	
	@Test
	public void test4() {
		
		Login1Pom login1=PageFactory.initElements(driver, Login1Pom.class);
		
		Library.custom_sendKeys(null, null, null);
		Library.custom_Click(null, null);
		
		Library.Custom_HandleDropDown(null, null);
		
		
	}

}
