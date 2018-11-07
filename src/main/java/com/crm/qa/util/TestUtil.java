package com.crm.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
public static long PAGE_LOAD_TIMEOUT=40;
public static long IMPLICIT_WAIT=40;

public void switchToFrame() {
	driver.switchTo().frame("mainpanel");
}

	
}
