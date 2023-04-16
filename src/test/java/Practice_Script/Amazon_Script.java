package Practice_Script;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Script {
	@Test
	public static void Tc_001() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//webelement
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//for scrolling
		WebElement mob=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[5]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", mob);
		mob.click();
		
		//childwindowhandle
		
		String parentwindowadd=driver.getWindowHandle();
		System.out.println(parentwindowadd);
		
		Set<String> set=driver.getWindowHandles();
		System.out.println(set);
		
		Iterator<String> it=set.iterator();
		
		while(it.hasNext()) {
			String childwindowadd=it.next();
			if(!parentwindowadd.equals(childwindowadd)) {
				driver.switchTo().window(childwindowadd);
				
				System.out.println(driver.findElement(By.xpath("//h1[@class='a-size-large a-spacing-none']")).getText());
				
				//scrolling addtocardbutton
				WebElement btn_addtoCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				js.executeScript("arguments[0].scrollIntoView()", btn_addtoCart);
				btn_addtoCart.click();
				
				
				driver.findElement(By.xpath("(//input[@class='a-button-input'])[20]")).click();
				
				driver.navigate().refresh();
				driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
				//driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
				//driver.navigate().refresh();
				Thread.sleep(5000);
				
				//driver.quit();
				
			}
		}
	}

}
