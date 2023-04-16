package Wait;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Implicit extends BaseClass {
	@Test
	public void tc_001() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("harshu@gmail.com");
		login.getTxt_pass().sendKeys("harshu");
		login.getBtn_click();
	}

}
