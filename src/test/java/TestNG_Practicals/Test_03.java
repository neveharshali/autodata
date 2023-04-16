package TestNG_Practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_03 extends BaseClass   {
	//WebDriver driver;
	//@BeforeMethod
	/*public void setup() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","/Users/chrome/chromedriver");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}*/
	@Test
	public void Test_1() throws Exception {
		
		WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
		Username.sendKeys("Test@gmail.com");
		System.out.println(Username);
		Thread.sleep(3000);
	}
	@Test
	public void password() throws Exception {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		Thread.sleep(3000);
	}
	@Test
	public void btn_click() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		
		
	}
	@Test
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	@Test
	public void getCurrenturl() {
		System.out.println(driver.getCurrentUrl());
	}
	/*@AfterMethod
	public void teardown() {
		driver.close();
	}*/

}
