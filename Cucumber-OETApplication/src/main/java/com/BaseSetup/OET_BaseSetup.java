package com.BaseSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OET_BaseSetup 
{
	public static WebDriver driver;
	
	public OET_BaseSetup()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
	//	WebDriverManager.firefoxdriver().setup();
		
	//	driver=new FirefoxDriver();
		
	}
	
	public void launchApplication()
	{
		driver.get("https://www.occupationalenglishtest.org/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public static void main(String[] args) {
		OET_BaseSetup obj=new OET_BaseSetup();
		
		obj.launchApplication();
	}

}
