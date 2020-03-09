package com.TestData;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OET_TestData 
{
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell fieldName, fieldValue;
	
	static HashMap<String, String> testData;
		
	public static HashMap<String, String> getRegisterationTestData(int columnNo)
	{
		try 
		{
			workbook=new XSSFWorkbook("C:\\Users\\sugat\\Google Drive\\Selenium\\Test Data\\OET_Data.xlsx");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
				
		testData=new HashMap<String, String>();
		sheet=workbook.getSheet("RegisterationData");
		
		System.out.println(sheet.getPhysicalNumberOfRows());
		
		for (int j = 1; j < sheet.getPhysicalNumberOfRows(); j++) 
		{
			fieldName=sheet.getRow(j).getCell(0);
			fieldValue=sheet.getRow(j).getCell(columnNo);
			
			System.out.println(fieldName.getStringCellValue()+" "+ fieldValue.getStringCellValue());
			testData.put(fieldName.getStringCellValue(), fieldValue.getStringCellValue());
		}
		
		return testData;

	}
	
	public void showTestData()
	{
		testData.toString();
	}
	
	public static void main(String[] args) 
	{
		OET_TestData obj=new OET_TestData();
		 
		OET_TestData.getRegisterationTestData(1);
		
		obj.showTestData();
	}

}
