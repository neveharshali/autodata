package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_03 {
	public static void HandleByDropDown(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}

	public static void main(String[] args) {
		// TO open Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));

	}

}
