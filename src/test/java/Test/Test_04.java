package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_04 {

	public static void main(String[] args) throws InterruptedException {
		//Browser Opening 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Identify the Webelement-->Locators-->id
		//WebElement txt_email=driver.findElement(By.tagName("input"));
		//txt_email.sendKeys("Test@gmail.com");
		
		WebElement txt_email1=driver.findElement(By.xpath("(//input[@id && @name])[1]"));
		txt_email1.sendKeys("Test@gmail.com");
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("argument[0].value='Test@gmail.com'", txt_email1);
		
		WebElement Txt_Password=driver.findElement(By.id("pass"));
		Txt_Password.sendKeys("123456");
		
		//Identify the Webelement-->Locators-->name
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
		Thread.sleep(5000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		

	}

}
