package Task_Testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TaskDemo.LoginPom;
import Task_Baseclass.BaseClass;

public class TC_003 extends BaseClass {
	@Test
	public void Test_03() throws Exception {
		//3)To verify Invalid email and valid password should be accept or not  then capture the screenshot.
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("test2gmail.com");
		login.getPassword().sendKeys("demo1234");
		login.getClick().click();
		Thread.sleep(5000);
		
		String path="C:\\Users\\neveh\\eclipse-workspace\\Batch_12Project\\LoginPageScreenshot";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"//Test.png");
		FileUtils.copyFile(src, dest);
		
	}


}
