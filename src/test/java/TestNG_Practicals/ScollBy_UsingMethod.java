package TestNG_Practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScollBy_UsingMethod {
	@Test
	public void m1() throws Exception {
		//opening Browser code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Scroll By Element
				
				WebElement english =driver.findElement(By.xpath("//li[text()='English (UK)']"));
				
				//WebElement watch=driver.findElement(By.xpath("//a[text()='Watch']"));
				custom_ScrollByElement(driver, english);
				
				//custom_ScrollByElement(driver, watch);
	}
	public static void custom_ScrollByElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		
	}
}
