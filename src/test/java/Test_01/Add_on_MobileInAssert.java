package Test_01;

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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_on_MobileInAssert {
	@Test
	public void Amozon_Test_1() throws Exception {
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
				System.out.println(title.getText());
				
				//verify Happy independence day
				//WebElement target=driver.findElement(By.xpath("//img[@alt='Happy Independence Day']"));
				WebElement target=driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']"));
				String res=target.getText();
				Thread.sleep(5000);
				System.out.println(res);
				Thread.sleep(5000);
				String actual=res;
				
				
				
				String Expected="amozon.in";
				Assert.assertEquals(actual, Expected);


	}

}
