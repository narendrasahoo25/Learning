package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Narendra\\Personal\\Study\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		//driver.navigate().to("https://www.amazon.ca/");
		//Back and Forward buttons simulation
		//driver.navigate().back();
		//Thread.sleep(2000);
		
		//driver.navigate().forward();
		//Thread.sleep(2000);
		
		//driver.navigate().back();
		
		//To refresh the page again
		//driver.navigate().refresh();
		driver.findElement(By.name("username")).sendKeys("narensahoo5");
		driver.findElement(By.name("password")).sendKeys("test1234");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login' and @class='btn btn-small']")).click();
		//Thread.sleep(5000);
		//WebElement username=driver.findElement(By.xpath("//td[contains(text(),'User: Narendra Sahoo')]"));
	}

}
