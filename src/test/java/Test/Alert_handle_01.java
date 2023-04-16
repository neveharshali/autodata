package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_handle_01 {

	public static void main(String[] args) throws Exception {
		// To browser opening code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//identify element on webpage
		WebElement cust=driver.findElement(By.xpath("//input[@name='cusid']"));
		cust.sendKeys("12345");
		WebElement btn_sub=driver.findElement(By.xpath("//input[@name='submit']"));
		btn_sub.click();
		
		//driver navigate alert window
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();//ok click
		Thread.sleep(3000);
		String txt=alt.getText();
		System.out.println(txt);
		alt.accept();//2nd alert window ok click
		driver.close();

	}

}
