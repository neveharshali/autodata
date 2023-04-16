package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Login {

	public static void main(String[] args) throws InterruptedException {
		// TO Browser opening Code
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?");
		driver.manage().window().maximize();
		
		//identify webelement on webpage -->xpath
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("neveharshali@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();//(//button[@type='submit'])[2]
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
	}

}
