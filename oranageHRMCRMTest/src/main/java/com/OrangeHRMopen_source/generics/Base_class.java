package com.OrangeHRMopen_source.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.OrangeHRMopen_source.object_repository_pom.Add_usersPage;
import com.OrangeHRMopen_source.object_repository_pom.Admin_page;
import com.OrangeHRMopen_source.object_repository_pom.Login_page;
import com.OrangeHRMopen_source.object_repository_pom.Orange_Logout;
import com.OrangeHRMopen_source.object_repository_pom.System_users;

public class Base_class implements FrameWork_constants {
	
	public static WebDriver d;
	public FileLib f=new FileLib();
	public Admin_page ap=new Admin_page (d);
	public Add_usersPage au=new Add_usersPage(d);	
	public Login_page lp=new Login_page(d);
	public System_users su=new System_users(d);
	public WebDriverCommonLib w=new WebDriverCommonLib();
	
	
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		 d =new FirefoxDriver();
		 d.manage().window().maximize();
		 w.WaitForElementInGui(d);
		
		 
	}
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		d.close();
	}
	@BeforeMethod
	public void login() throws IOException 
	{
		Login_page lp=new Login_page(d);
        String un = f.getPropertyValue("UN");
        String pwd = f.getPropertyValue("PWD");
        d.get(f.getPropertyValue("URL"));
        lp.setusername(un);
		lp.setpwd(pwd);
		lp.clicklogin();
	}
	@AfterMethod
	public void logout() throws InterruptedException{
		Orange_Logout lo=new Orange_Logout(d);
		
			lo.setWelcom();
		
		
	}

}
