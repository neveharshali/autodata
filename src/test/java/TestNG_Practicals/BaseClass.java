package TestNG_Practicals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
@BeforeMethod
public void setup() {
	WebDriverManager.chromedriver().setup();
	
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
}
@AfterMethod
public void teardown() {
	driver.close();
}
	
}
