package com.OrangeHRMopen_source.generics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.google.common.io.Files;

public class Listenerimplementation extends Base_class implements ITestListener{

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String r=result.getName();
		TakesScreenshot ts=(TakesScreenshot) d;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+r+".png");
		try{
			Files.copy(source, dest);
		}
		catch (IOException e){

		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

}
