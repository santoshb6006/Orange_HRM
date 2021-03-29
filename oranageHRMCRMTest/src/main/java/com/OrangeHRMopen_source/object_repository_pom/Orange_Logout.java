package com.OrangeHRMopen_source.object_repository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_Logout {
@FindBy(id="welcome") private WebElement welcombtn;
@FindBy(xpath="//a[.='Logout']") private WebElement logoutb;

public Orange_Logout(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
public void setWelcom() throws InterruptedException
{
	welcombtn.click();
	Thread.sleep(2000);
	logoutb.click();

}
	}