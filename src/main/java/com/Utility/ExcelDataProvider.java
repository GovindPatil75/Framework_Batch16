package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		
		String excelpath="C:\\Users\\Dell\\Desktop\\Visionfolder\\Framework_Batch16\\TestData\\Data.xlsx";
		
		FileInputStream fis=new FileInputStream(excelpath);
		
		wb=new XSSFWorkbook(fis);
		
		
	}
	
	public String getStringData_Excel(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	
	
	

}
