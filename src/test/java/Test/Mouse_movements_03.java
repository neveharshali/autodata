package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_movements_03 {

	public static void main(String[] args) throws InterruptedException {
		//Browser opening
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//create object on actions class
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop(src, dest).build().perform();
		Thread.sleep(5000);
		
		//2nd dropdown handle
		WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop(src1, dest1).build().perform();
		Thread.sleep(5000);
		
		////3rd dropdown handle
		WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dest2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop(src2, dest2).build().perform();
		Thread.sleep(5000);
		
		////4th dropdown handle
			WebElement src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
			WebElement dest3=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			
			act.dragAndDrop(src3, dest3).build().perform();
			Thread.sleep(5000);
		
		driver.close();
		
	}

}
