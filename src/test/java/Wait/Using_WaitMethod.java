package Wait;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Using_WaitMethod extends BaseClass{
	@Test
	public void tc_001() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("Hasrshu@gmail.com");
		//Library.getExplicitlywait(driver, 10, login.getTxt_email());
		login.getTxt_pass().sendKeys("123456");
		//Library.getExplicitlywait(driver, 20,login.getTxt_pass() );
		login.getBtn_click().click();
		//Library.getExplicitlywait(driver, 30,login.getBtn_click() );
	}

}
