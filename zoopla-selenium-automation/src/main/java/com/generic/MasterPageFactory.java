package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {

	public MasterPageFactory (WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy (xpath="(//*[contains(text(),'Accept all cookies')])[2]")
	private WebElement acceptAllCookiesBtn;
	
	@FindBy(xpath = "(//*[@class='css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0'])[4]")
	private WebElement Signinbutton;
	
	
	@FindBy(xpath = "//*[contains(@id,'input-email-address')]")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@class='css-gi0wky-Button-SignInButton e1oiir0n4']")
	private WebElement signinbutton2;
	
	@FindBy(xpath =  "(//*[contains(text(),'My Zoopla')])[1]")
	private WebElement Myzooplabtn;

	@FindBy(xpath = "(//*[contains(text(),'Sign out')])[1]")
	private WebElement Signoutbutton;

	
	public WebElement getAcceptallcookies() {
		return acceptAllCookiesBtn;
	}

	public WebElement getSigninbutton() {
		return Signinbutton;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigninbutton2() {
		return signinbutton2;
	}
	public WebElement getMyzooplabtn() {
		return Myzooplabtn;
	}
	public WebElement getSignoutbutton() {
		return Signoutbutton;
	}

}
