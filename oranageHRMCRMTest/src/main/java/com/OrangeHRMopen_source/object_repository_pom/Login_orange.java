//package com.OrangeHRMopen_source.object_repository_pom;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class Login_orange {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","./softwarefm/chromedriver.exe");
//		WebDriver d=new ChromeDriver();
//		d.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");	
//		d.manage().window().maximize();
//		Login_page lp=new Login_page(d);
//		lp.setusername("admin");
//		lp.setpwd("admin123");
//		lp.clicklogin();
//
//		Admin_page ap=new Admin_page(d);
//		ap.clickUser(d);
//		
//
//		System_users su=new System_users(d);
//		
//		su.addUser();
//	
//
//		Add_usersPage aup=new Add_usersPage(d);
//		Thread.sleep(3000);
//		aup.setuserRol(1);
//		Thread.sleep(3000);
//		aup.setempName("Anthony Nolan");
//		aup.setUsername("Happyp");
//		aup.setStatus(1);
//		aup.setPassword("Sachi123");
//		aup.setConfirmpasd("Sachi123");
//		aup.savebtnn();
//		
//		Thread.sleep(2000);		
//		Orange_Logout lo=new Orange_Logout(d);
//		Thread.sleep(2000);
//		lo.setWelcom();
//	}
//	
//}
