package com.OrangeHRMopen_source.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

	public void WaitForElementInGui(WebDriver driver)//method name =WaitForElementInGui
	{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void WaitForElementPresent(WebDriver driver, WebElement element)
	{
	  WebDriverWait wait =new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.visibilityOf(element));
	}

  

}

