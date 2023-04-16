package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop_06 {

	public static void main(String[] args) throws InterruptedException {
		//Browser opening code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[text()='Accepted Elements']")).click();
				
		//xpath find element
		WebElement src2=driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement dest2=driver.findElement(By.xpath("//div[@id='trash']"));
		Mouse_Movement_byusingMehod.HandleDragDrop(driver, src2, dest2);
		Thread.sleep(5000);
	}

}
