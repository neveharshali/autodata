package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Movement_byusingMehod {
	public static void HandleDragDrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
	}


	public static void main(String[] args) throws InterruptedException {
		//Browser opening code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//1st draganddrop
		WebElement btn_src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement btn_dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		HandleDragDrop(driver,btn_src,btn_dest);
		Thread.sleep(5000);
		
		//2nd dropdown handle
		WebElement btn_src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement btn_dest1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		HandleDragDrop(driver,btn_src1,btn_dest1);
		Thread.sleep(5000);
		
		//3rd dropdown handle
		WebElement btn_src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement btn_dest2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		HandleDragDrop(driver,btn_src2,btn_dest2);
		Thread.sleep(5000);
		
		//4th dropdown handle
		WebElement btn_src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement btn_dest3=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		HandleDragDrop(driver,btn_src3,btn_dest3);
		Thread.sleep(5000);
				
			
		
				
		driver.close();
		

	}

}
