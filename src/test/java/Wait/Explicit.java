package Wait;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit extends BaseClass {
	@Test
	public void tc_001() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("Harshu@gmail.com");
		
		//create WebDriverWait object
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.visibilityOf(login.getTxt_email()));
		
		//login.getTxt_pass().sendKeys("harshu");
		//wait.until(ExpectedConditions.visibilityOf(login.getTxt_pass()));
		//login.getBtn_click().click();
		//wait.until(ExpectedConditions.visibilityOf(login.getBtn_click()));
	}

}
