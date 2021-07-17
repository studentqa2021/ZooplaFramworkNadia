package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;

public class DriverManager {

	public WebDriver getDriver(){
		
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	BaseConfig obj = new BaseConfig();
	
	driver.navigate().to(BaseConfig.getData("QA_URL"));
	driver.manage().window().maximize();
	return driver;
	}

	}
	

