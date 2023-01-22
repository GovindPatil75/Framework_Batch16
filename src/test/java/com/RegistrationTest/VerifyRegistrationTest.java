package com.RegistrationTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PomPages.RegistrationPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyRegistrationTest extends BaseClass{
	
	
	@Test
	public void Tc_001_Verify_Registration_Page_functionality () {
		
		RegistrationPom reg=PageFactory.initElements(driver, RegistrationPom.class);
		Library.custom_sendKeys(reg.gettxt_firstname(), excel.getStringData_Excel("RegistrationModule", 1, 0),"FirstName");
		
	}

}
