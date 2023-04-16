package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_0n_Fb {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement TXT_FN=driver.findElement(By.xpath("//input[@name='firstname']"));
		TXT_FN.sendKeys("Nikhil");
		Thread.sleep(3000);
		
		WebElement Txt_LN=driver.findElement(By.xpath("//input[@name='lastname']"));
		Txt_LN.sendKeys("Neve");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("test@gmail.com");

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456");
		Thread.sleep(3000);
		
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select=new Select(day);
		select.selectByIndex(7);
		Thread.sleep(3000);
		
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel=new Select(month);
		sel.selectByVisibleText("Apr");
		Thread.sleep(3000);
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sel1=new Select( year);
		sel1.selectByValue("1996");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
