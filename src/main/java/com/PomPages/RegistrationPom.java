package com.PomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPom {
	
	
	@FindBy(how=How.XPATH,using="//input[@name='FirstName']")
	private WebElement txt_firstname;
	
	
	public WebElement gettxt_firstname() {
		return txt_firstname;
	}

}
