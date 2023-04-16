package Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_01 {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TO Browser opening code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//To find webelement on webpage by using xpath
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Harshali@gmail.com");
		
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_password.sendKeys("123456");
		
		WebElement cl=driver.findElement(By.xpath("//button[@name='login']"));
		cl.click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		//select path for screenshot
		String path="C:\\Users\\neveh\\eclipse-workspace\\Batch_12Project\\Screenshot";
		

		//to take time and stamp here
		Date d=new Date();
		String FileName=d.toString().replace(":", "_").replace(" ", "_");
		
		
		//now take screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"//"+FileName+".png");
		FileUtils.copyFile(src, dest);
		
		
		driver.close();
		
		
		
		
		

	}

}
