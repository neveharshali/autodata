package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_02 {

	public static void main(String[] args) throws InterruptedException {
		//to open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		//over the mouse gmail on google webpage
		WebElement cl=driver.findElement(By.xpath("//a[text()='Gmail']"));
		act.moveToElement(cl).build().perform();
		//act.click(cl).build().perform();
		Thread.sleep(5000);

	}

}
