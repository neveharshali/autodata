package Test_1verify;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import Test_Demo.Signuppom;

public class Test_2 extends BaseClass {
	@Test
	public void tc_001() throws Exception {
		Signuppom signup=PageFactory.initElements(driver, Signuppom.class);
		signup.getTxt_firstname().sendKeys("harshu");
		Thread.sleep(3000);
		signup.getTxt_lastname().sendKeys("neve");
		Thread.sleep(3000);
		
		signup.getBtn_click().click();
	}

}
