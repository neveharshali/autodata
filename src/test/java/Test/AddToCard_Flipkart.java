package Test;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCard_Flipkart {

	public static void main(String[] args) throws Exception {
		// 	To Open Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//identify webelement on webpage
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li"));
		Thread.sleep(5000);
		//System.out.println(list.size());
		
		//click on 8 no element in autosuggestion list
		System.out.println(list.get(7).getText());
		list.get(7).click();
		/*for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i).getText());
        	if(list.get(i).getText().equals("realme mobile")) {
        		list.get(i).click();
        		break;
        	}
        	
        }*/
		
		//add to cart mobile realme c35
		//over the mouse on mobile
		//Actions act=new Actions(driver);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		
		WebElement sel=driver.findElement(By.xpath("//div[text()='REDMI Note 10S (Deep Sea Blue, 64 GB)']"));
		sel.click();
        //act.moveToElement(sel).build().perform();
       // act.click(sel).build().perform();
		//act.doubleClick(sel).build().perform();
	}

}
