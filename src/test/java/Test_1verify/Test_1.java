package Test_1verify;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import Test_Demo.Login_pom;

public class Test_1 extends BaseClass {
	@Test
	public void tc_001() throws Exception {
		Login_pom login=PageFactory.initElements(driver, Login_pom.class);
		login.getTxt_email().sendKeys("Test@gmail.com");
		Thread.sleep(3000);
		login.getTxt_password().sendKeys("123456");
		Thread.sleep(3000);
		login.getbtn_login().click();
		Thread.sleep(3000);
	}

}
