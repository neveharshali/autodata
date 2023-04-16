package TaskDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement click;

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClick() {
		return click;
	}

	
}
