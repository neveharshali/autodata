package TestNG_Practicals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scolling {
@Test
public void m1() throws InterruptedException {
	//opening Browser code
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	
	//Typecasting
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	//ScrollBy pixel
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,-500)", "");
	Thread.sleep(5000);
	
	//ScrollBy element
	WebElement english=driver.findElement(By.xpath("//li[text()='English (UK)']"));
	js.executeScript("arguments[0].scrollIntoView()",english);
	
	driver.close();
}
}
