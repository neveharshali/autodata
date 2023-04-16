package IFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Iframe {
	@Test
	public void tc_001() {
		//to Browser Opening Code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/neveh/Desktop/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//how many iframe present on webpage
		System.out.println(driver.findElements(By.tagName("iframe")).size());//3
		
		//switch on iframe selenium on 1
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("Selenium");//id or name
		
		//webelement throught
		WebElement selenium=driver.findElement(By.xpath("//iframe[@name='Selenium']"));
		driver.switchTo().frame(selenium);
		
		//xpath find selenium element
		WebElement elementOption=driver.findElement(By.xpath("//button[@data-toggle='collapse']"));
		elementOption.click();
		
		//switch on main page
		driver.switchTo().defaultContent();
		
		//click on facebook
		driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']")).click();
		driver.navigate().back();
		driver.switchTo().frame(1);
		
		//driver.switchTo().parentFrame();
		try {
		elementOption.click();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
