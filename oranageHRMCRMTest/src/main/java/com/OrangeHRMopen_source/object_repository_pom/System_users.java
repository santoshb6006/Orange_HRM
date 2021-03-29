package com.OrangeHRMopen_source.object_repository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class System_users {
	@FindBy(name="btnAdd") private WebElement adbtn;
	

	public System_users(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void addUser()
	
	{
         adbtn.click();
    
	}

}
