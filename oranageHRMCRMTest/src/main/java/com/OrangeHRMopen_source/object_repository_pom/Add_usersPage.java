package com.OrangeHRMopen_source.object_repository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_usersPage {
	

	@FindBy(id="systemUser_userType") private WebElement UserRol;
	@FindBy(id="systemUser_employeeName_empName") private WebElement Employeename;
	@FindBy(id="systemUser_userName") private WebElement Username;
	@FindBy(id="systemUser_status") private WebElement Status;
	@FindBy(id="systemUser_password") private WebElement Passwordt;
	@FindBy(id="systemUser_confirmPassword") private WebElement Confrmpasd;
	@FindBy(id="btnSave") private WebElement savebtn;
	//@FindBy(xpath="//a[.='Anthony.Nolan']") private WebElement particularUser;
	//@FindBy(xpath="//td[@class='left'][1]") private WebElement alluser;
	
	
	public Add_usersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	} 
	public void setuserRol(int i) 
	{
	Select sel= new Select(UserRol);
	sel.selectByIndex(i);
	}
	public void setempName(String enmae)
	{
		Employeename.sendKeys(enmae);
	}
	public void setUsername (String uname)
	{
		Username.sendKeys(uname);
	} 
	public void setStatus(int i)
	{
	Select sel= new Select(Status);
	sel.selectByIndex(i);
	}
	public void setPassword (String psd)
	{
		Passwordt.sendKeys(psd);
	}
	public void setConfirmpasd (String cpsd)
	{
		Confrmpasd.sendKeys(cpsd);
	}
	public void savebtnn()
	{
		savebtn.click();
	}
	
	
	
}  
