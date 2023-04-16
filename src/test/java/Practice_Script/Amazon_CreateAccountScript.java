package Practice_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_CreateAccountScript {
	@Test
	public static void Tc_002() {
		//Open Browser Code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//click on signInButton
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
		
		//click on Create new Acc
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		
		//passvalue to firstname
		driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Harshali Neve");
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("7066678440");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("neveharshali@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Harshali@123");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.close();
	}
	

}
