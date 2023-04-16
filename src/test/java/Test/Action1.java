package Test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//move the elements& click on
		WebElement sel=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		act.moveToElement(sel).click(sel).build().perform();
		//act.moveToElement(sel).click().build().perform();
		//act.click(sel).build().perform();
		Thread.sleep(5000);
		
		//right click on element on webpage
		WebElement cl= driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(cl).build().perform();
		act.click(cl).build().perform();
		Thread.sleep(5000);
		
		//double click on webpage
		WebElement dou=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(dou).build().perform();
		Thread.sleep(5000);
		
		//driver.close();
		
		

	}

}
