package com.OranageHRMopen_source.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OrangeHRMopen_source.generics.Base_class;
import com.OrangeHRMopen_source.object_repository_pom.Add_usersPage;
import com.OrangeHRMopen_source.object_repository_pom.Admin_page;
import com.OrangeHRMopen_source.object_repository_pom.System_users;
@Listeners(com.OrangeHRMopen_source.generics.Listenerimplementation.class)
public class Admin extends Base_class{
	@Test
	public void User() throws InterruptedException
	{
		Admin_page ap=new Admin_page(d);
		ap.clickUser(d);
		
		System_users su =new System_users(d);	
		su.addUser();
		
		Add_usersPage au= new Add_usersPage(d);	
		au.setuserRol(1);
		au.setempName("Aaliyah Haq");
		au.setUsername("Dellpasc");
		au.setStatus(1);
		au.setPassword("test123123");
		au.setConfirmpasd("test123123");
		Thread.sleep(2000);
		au.savebtnn();
	}

	@Test
	public void dinga()
	{
		Reporter.log("failed",true);
		Assert.fail();
	}
	@Test
	public void santu()
	{
		Reporter.log("2nd failed",true);
		Assert.fail();
	}
}
