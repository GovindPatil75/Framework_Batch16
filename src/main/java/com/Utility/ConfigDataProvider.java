package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public ConfigDataProvider() throws Exception {
		
		String filepath="C:\\Users\\Dell\\Desktop\\Visionfolder\\Framework_Batch16\\Config\\Config.Properties";
		
		FileInputStream file=new FileInputStream(filepath);
		 pro=new Properties();
		 pro.load(file);
		
	}

	public String getBaseUrlQA1() {
		return pro.getProperty("BaseUrlQA1");
	}
	
	public String getBrowserName() {
		return pro.getProperty("BrowserName");
	}
	
	
	
}
