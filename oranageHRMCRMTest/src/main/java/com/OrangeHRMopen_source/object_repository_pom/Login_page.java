package com.OrangeHRMopen_source.object_repository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
@FindBy(id="txtUsername") private WebElement Usernametxt;

@FindBy(id="txtPassword") private WebElement passwordtxt;

@FindBy(id="btnLogin") private WebElement loginbutton;


 public Login_page(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
	 }
 
 
 public void setusername(String un)
	{  
		Usernametxt.sendKeys(un);
	}
	public void setpwd(String pwd)
	{
		passwordtxt.sendKeys(pwd);
	}
	public void clicklogin()
	{
		loginbutton.click();
	}
}