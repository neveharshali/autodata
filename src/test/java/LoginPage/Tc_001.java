package LoginPage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_001 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://minimals.cc/auth/login/");
		driver.manage().window().maximize();
		
		//1)To verify valid email and valid password should be accept  then capture the screenshot.
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("demo@minimals.cc");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String path="C:\\Users\\neveh\\eclipse-workspace\\Batch_12Project\\LoginPageScreenshot";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"//Test.png");
		FileUtils.copyFile(src, dest);
		

	}

}
