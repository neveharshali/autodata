package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_actions06 {

	public static void main(String[] args) throws InterruptedException {
		//Browser opening code
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		
		//create object actions class
		//Actions act=new Actions(driver);
		
		WebElement txt_username=driver.findElement(By.xpath("//input[@name='username']"));
		//txt_username.click();
		txt_username.sendKeys("harshu@gmail.com");
		Thread.sleep(5000);
		//driver.close();
		//act.keyDown(txt_username,Keys.SHIFT).sendKeys("harshali").keyUp(Keys.SHIFT).build().perform();

	}

}
