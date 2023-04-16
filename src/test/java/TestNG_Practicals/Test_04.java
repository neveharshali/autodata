package TestNG_Practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_04 extends BaseClass {

	@Test
	public void login_page() throws InterruptedException {
		WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
		Username.sendKeys("Test@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}
