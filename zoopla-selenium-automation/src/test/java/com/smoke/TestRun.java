package com.smoke;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.generic.Baselogin;
import com.generic.DriverManager;

public class TestRun {
	WebDriver driver;
	
   @BeforeTest
	public void setUp() {
	driver = new DriverManager().getDriver();
	
	}
	@Test (priority =0)
	public void getlogin() {
		Baselogin obj = new Baselogin();
				obj.masterlogin(driver);
}
    @AfterTest
	public void tearDown () {
	driver.quit();
}

}	



