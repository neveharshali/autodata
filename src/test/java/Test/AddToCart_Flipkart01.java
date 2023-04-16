package Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart_Flipkart01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//	 	To Open Browser
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			//identify webelement on webpage
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptop");
			Thread.sleep(5000);
			//driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']"));
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(5000);
			//here to get parentpopup address
			String parentwindowAdd=driver.getWindowHandle();
			System.out.println(parentwindowAdd);
			driver.findElement(By.xpath("(//div[@class='_4rR01T'])[15]")).click();
			
			//child window handle here
			Set<String> AllAddress=driver.getWindowHandles();
	        System.out.println(AllAddress);
	        
	        Iterator<String> it= AllAddress.iterator();
	        while(it.hasNext()){
	        	String childwindowaddress=it.next();
	        	if(!parentwindowAdd.equals(childwindowaddress)) {
	        		driver.switchTo().window(childwindowaddress);
	        		
	        		//identify webelement present on childwindow
	        		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	        		//driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	        		//driver.close();
	        	}
	        }
			
			
			

	}

}
