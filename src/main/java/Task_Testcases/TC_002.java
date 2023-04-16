package Task_Testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TaskDemo.LoginPom;
import Task_Baseclass.BaseClass;

public class TC_002 extends BaseClass {
	@Test
	public void Test_02() throws Exception {
		//2)To verify valid email and INVALID password should be accept or not  then capture the screenshot.
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("demo@minimals.cc");
		login.getPassword().sendKeys("DEMO1234");
		login.getClick().click();
		Thread.sleep(5000);
		
		String path="C:\\Users\\neveh\\eclipse-workspace\\Batch_12Project\\LoginPageScreenshot";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"//Test.png");
		FileUtils.copyFile(src, dest);
		
	}


}
