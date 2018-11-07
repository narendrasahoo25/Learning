package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class LoginPage extends TestBase {
//Page Factory - Object Repository
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy (xpath="//input[@type='submit' and @value='Login' and @class='btn btn-small']")
	WebElement loginBtn;
	//=driver.findElement(new ByChained(By.xpath("//div[@class='input-group']"), By.xpath("//div[@class='input-group-btn']"), By.xpath("//input[@type='submit']")));
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class, 'img-responsive')]")
	WebElement crmLogo;
	
	
	//Initialize the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		//Actions action=new Actions(driver);
		//action.moveToElement(loginBtn).click().build().perform();
		loginBtn.submit();
		return new HomePage();
	}
	
}
