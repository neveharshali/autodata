package Test_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Status_of_WebElement {

	public static void main(String[] args) {
		// TO Browser opening code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//click on create acc button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//isDisplay(): to check data display or not
		//isEnable():data accept or not
		
		WebElement Txt_firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		Txt_firstname.sendKeys("Harshali");
		
		System.out.println(Txt_firstname.isDisplayed());//True
		System.out.println(Txt_firstname.isEnabled());//true
		
		//isSelected=check radiobutton ,checkbox,dropdown
		 
		WebElement female=driver.findElement(By.xpath("//label[text()='Female']"));
		WebElement male=driver.findElement(By.xpath("//label[text()='Male']"));
		
		System.out.println(female.isSelected());//false
		System.out.println(male.isSelected());//false
		 
		//male.click();
		//System.out.println(male.isSelected());//true
		female.click();
		System.out.println(female.isSelected());//false
		
		driver.close();
		
		
		
	}

}
