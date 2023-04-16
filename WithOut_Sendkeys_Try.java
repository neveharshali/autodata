package TestNG_Practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithOut_Sendkeys_Try {
	@Test
	public void Test_1() throws InterruptedException {
		//opening browser code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//without sendkeys pass value
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		//username.sendKeys("Test@gmail.com");
		js.executeScript("arguments[0].value='Test@gmail.com';", username);
		Thread.sleep(3000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		//pass.sendKeys("123456");
		js.executeScript("arguments[0].value='123456';", pass);
		Thread.sleep(3000);
		WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click();", btn_login);
		//btn_login.click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
