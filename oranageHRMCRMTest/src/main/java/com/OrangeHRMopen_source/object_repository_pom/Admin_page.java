package com.OrangeHRMopen_source.object_repository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_page {
	public Actions act;
	@FindBy(id="menu_admin_viewAdminModule") private WebElement admin_mod;
	@FindBy(id="menu_admin_UserManagement") private WebElement user_mod;
	@FindBy(id="menu_admin_viewSystemUsers") private WebElement users_m;

	public Admin_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickUser(WebDriver driver) throws InterruptedException
	{
		act=new Actions(driver);
		act.moveToElement(admin_mod).perform();
		act.moveToElement(user_mod).perform();
		Thread.sleep(2000);
		act.moveToElement(users_m).click().perform(); 	

	}

}
