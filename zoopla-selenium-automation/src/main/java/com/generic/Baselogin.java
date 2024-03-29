package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.util.BaseConfig;
import com.util.HighLighter;
import com.util.ScreenShot;

public class Baselogin {

	public MasterPageFactory masterlogin(WebDriver driver) {
		
		MasterPageFactory obj = new MasterPageFactory (driver);
		
		obj.getAcceptallcookies().click();
		
		ScreenShot.getpics(driver,"Before login");
		obj.getSigninbutton().click();
		
		HighLighter.addColor(driver,obj.getEmail());
		obj.getEmail().sendKeys(BaseConfig.getData("user"));
		
	    HighLighter.addColor(driver,obj.getPassword());
		obj.getPassword().sendKeys(BaseConfig.getData("pass"));;
		
		obj.getSigninbutton2().click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Actions ac = new Actions(driver);
		ac.moveToElement(obj.getMyzooplabtn()).build().perform();
		
	    obj.getSignoutbutton().click();
	 
		
		return obj;
	}

}