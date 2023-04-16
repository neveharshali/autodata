package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_To_Cart_Amozon {

	public static void main(String[] args) throws Exception {
		//To Browser Opening
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//serchbar xpathfind and send serch mobile
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		//clickon serch button
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//click on first mobile
		driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]")).click();
		Thread.sleep(3000);
		
		//now take Screenshot
		String path="C:\\Users\\neveh\\eclipse-workspace\\Batch_12Project\\Screenshot";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"//mobileSS.png");
		FileUtils.copyFile(src, dest);
		
		//to get text mobile name
		
		WebElement title=driver.findElement(By.xpath("//span[@id='productTitle']"));
		Thread.sleep(5000);
		System.out.println(title.getText());
		
		//driver.navigate().back();
		
		//verify Happy independence day
		Thread.sleep(5000);
		WebElement target=driver.findElement(By.xpath("//a[@aria-label='Happy Independence Day']"));
		Thread.sleep(5000);
		String actual=target.getText();
		
		System.out.println(actual);
		
		
		String Expected="Happy Independence Day";
		Assert.assertEquals(actual, Expected);

	}

}
