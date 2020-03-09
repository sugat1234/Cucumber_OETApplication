package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.OET_BaseSetup;
import com.TestData.OET_TestData;

public class OET_Registration extends OET_BaseSetup 
{
	public HashMap<String, String> testData;
	
	public void navigateToRegisterationPage()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		driver.findElement(By.xpath("//div[@class='vc_col-sm-12 wpb_column column_container vc_column_container col padding-4-percent instance-4']//a[@class='column-link']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	}
	
	public void fillRegisterationDetails(int columnNo)
	{
		testData=OET_TestData.getRegisterationTestData(columnNo);
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(testData.get("givenName_value"));
		
		driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys(testData.get("middleName_value"));
		
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(testData.get("familyName_value"));
		
		Select gender=new Select(driver.findElement(By.xpath("//select[@id='gender']")));
		gender.selectByVisibleText(testData.get("gender_value"));
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		String script= "arguments[0].setAttribute('value','"+testData.get("dateOfBirth_value")+"');";
		jse.executeScript(script, driver.findElement(By.xpath("//input[@id='dob']")));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='photo']")));

		try {Thread.sleep(6000);} catch (InterruptedException e1) {e1.printStackTrace();}
		
		try 
		{
			Runtime.getRuntime().exec("C:\\Users\\sugat\\Google Drive\\Selenium\\oetScript.exe");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//input[@id='profession']")).sendKeys(testData.get("profession_value"));
		
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys(testData.get("address_value"));
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(testData.get("city_value"));
		
		Select country=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		country.selectByVisibleText(testData.get("country_value"));
	
		if(!testData.get("country_value").equalsIgnoreCase("Select country"))
		{
			Select state=new Select(driver.findElement(By.xpath("//select[@id='state']")));
			state.selectByVisibleText(testData.get("state_value"));	
		}
		
		
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys(testData.get("postcode_value"));
		
		driver.findElement(By.xpath("//input[@id='countryCode']")).sendKeys(testData.get("contactCountryCode_value"));
		
		driver.findElement(By.xpath("//input[@id='areaCode']")).sendKeys(testData.get("contactAreaCode_value"));
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(testData.get("contactPhoneNumber_value"));
		
		Select idType=new Select(driver.findElement(By.xpath("//select[@id='idType']")));
		idType.selectByVisibleText(testData.get("idType_value"));
		
		driver.findElement(By.xpath("//input[@id='idNumber']")).sendKeys(testData.get("idNumber_value"));
		
		Select nationality=new Select(driver.findElement(By.xpath("//select[@id='nationality']")));
		nationality.selectByVisibleText(testData.get("nationality_value"));
		
		Select firstLanguage=new Select(driver.findElement(By.xpath("//select[@id='firstLanguage']")));
		firstLanguage.selectByVisibleText(testData.get("firstLanguage_value"));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(testData.get("email_value"));
		
		driver.findElement(By.xpath("//input[@id='confirmemail']")).sendKeys(testData.get("confirmEmail_value"));
	}
	
	
	public void clickNext()
	{
		driver.findElement(By.xpath("//input[@class='submit-btn goToPage2']")).click(); 
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(scrFile, new File("C:\\Users\\sugat\\Google Drive\\Selenium\\Screenshots\\OET\\"+testData.get("testCaseName_value")+".png"));
		} catch (IOException e) 
		{
			e.printStackTrace();
		}

	}
	
	public void clickReset()
	{
		driver.findElement(By.xpath("//input[@id='btnReset']")).click(); 
	}
	
	public static void main(String[] args) {
		OET_Registration obj=new OET_Registration();
		
		obj.launchApplication();
		obj.navigateToRegisterationPage();
		obj.fillRegisterationDetails(1);
		obj.clickNext();
	}

}
